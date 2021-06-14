package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.authorize.HttpRequestType;
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

import static com.nicico.cost.framework.config.general.GeneralStatic.*;

@RestController
@RequestMapping(value = "/rest/integration/v1/cost-type")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Cost-Type", description = "سرویس مدیریت اطلاعات پایه")})
@Unauthorized(urls = {"/rest/integration/v1/cost-type/findByCode"})
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
}
