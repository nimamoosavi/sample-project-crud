package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.CostType;
import com.nicico.cost.integration.domain.view.costtype.CostTypeReqVM;
import com.nicico.cost.integration.domain.view.costtype.CostTypeResVM;
import com.nicico.cost.integration.service.CostTypeService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.nicico.cost.framework.config.general.GeneralStatic.*;

@RestController
@RequestMapping(value = "/rest/integration/v1/cost-type")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Cost-Type", description = "سرویس مدیریت اطلاعات پایه")})
@RequiredArgsConstructor
public class CostTypeController extends BaseController<CostType, CostTypeReqVM, CostTypeResVM, Long> {

    private final CostTypeService costTypeService;

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/findByCode")
    public ResponseEntity<BaseDTO<CostTypeResVM>> findByCode(@RequestParam String code) {
        return ResponseEntity.ok(costTypeService.findByCode(code));
    }

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/findAllByParentCode")
    public ResponseEntity<BaseDTO<List<CostTypeResVM>>> findAllByParentCode(@RequestParam String code) {
        return ResponseEntity.ok(costTypeService.findAllByParentCode(code));
    }

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/findAllByParentId")
    public ResponseEntity<BaseDTO<List<CostTypeResVM>>> findAllByParentId(@RequestParam Long id) {
        return ResponseEntity.ok(costTypeService.findAllByParentId(id));
    }

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/findAllParents")
    public ResponseEntity<BaseDTO<List<CostTypeResVM>>> findAllParents() {
        return ResponseEntity.ok(costTypeService.findAllParents());
    }


}
