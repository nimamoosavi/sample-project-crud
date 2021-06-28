package com.nicico.cost.integration.controller;

import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.domain.dto.PageDTO;
import com.nicico.cost.integration.domain.view.detail.DetailReqVM;
import com.nicico.cost.integration.domain.view.detail.DetailResVM;
import com.nicico.cost.integration.service.DetailService;
import com.nicico.cost.tree.controller.TreeController;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.nicico.cost.framework.config.general.GeneralStatic.*;
import static com.nicico.cost.framework.config.general.GeneralStatic.CLIENT_VERSION;

@RestController
@RequestMapping(value = "/rest/integration/v1/detail")
@Api(value = "detail", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "detail", description = "سرویس مدیریت اطلاعات تفضیلی")})
@RequiredArgsConstructor
public class DetailController extends TreeController<DetailReqVM, DetailResVM, Long> {

    private final DetailService detailService;


    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/detail-type")
    public ResponseEntity<BaseDTO<List<DetailResVM>>> findAllByDetailType(@RequestParam Long typeId) {
        return new ResponseEntity<>(detailService.findAllByDetailTypes(typeId), HttpStatus.OK);
    }

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/pagination/detail-type")
    public ResponseEntity<BaseDTO<PageDTO<List<DetailResVM>>>> findAllByDetailTypeByPagination(@RequestParam Long typeId, @RequestParam Integer page, @RequestParam Integer pageSize) {
        return new ResponseEntity<>(detailService.findAllByDetailTypes(typeId,page,pageSize), HttpStatus.OK);
    }
}
