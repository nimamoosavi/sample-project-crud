package com.webold.integration.controller;

import com.webold.crud.controller.BaseController;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.accmap.AccMapDetailType;
import com.webold.integration.domain.view.accmap.AccMapReqVM;
import com.webold.integration.domain.view.accmap.AccMapResVM;
import com.webold.integration.domain.view.accmap.AccMapValidate;
import com.webold.integration.service.AccMapService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/integration/v1/acc-map")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Acc-Map", description = "سرویس مدیریت اطلاعات پایه")})
@RequiredArgsConstructor
public class AccMapController extends BaseController<AccMapReqVM, AccMapResVM, Long> {

    private final AccMapService accMapService;

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @PostMapping("/map/detail-type")
    public ResponseEntity<BaseDTO<AccMapResVM>> mapDetailTypeToAcc(@RequestBody AccMapDetailType mapDetailType) {
        return ResponseEntity.ok(accMapService.mapDetailTypeToAcc(mapDetailType));
    }


    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @PostMapping("/map/all/detail-type")
    public ResponseEntity<BaseDTO<List<AccMapResVM>>> mapAllDetailTypeToAcc(@RequestBody List<AccMapDetailType> mapDetailTypes) {
        return ResponseEntity.ok(accMapService.mapAllDetailTypeToAcc(mapDetailTypes));
    }

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @PostMapping("/validate/detail-accMap")
    public ResponseEntity<BaseDTO<AccMapResVM>> validateAccMapAndDetail(@RequestBody AccMapValidate accMapValidate) {
        return ResponseEntity.ok(accMapService.validateAccMapDetail(accMapValidate));
    }


}
