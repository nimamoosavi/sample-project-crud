package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.department.DepartmentReqVM;
import com.nicico.cost.integration.domain.view.department.DepartmentResVM;
import com.nicico.cost.integration.service.DepartmentService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.nicico.cost.framework.config.general.GeneralStatic.*;

@RestController
@RequestMapping(value = "/rest/integration/v1/department")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Department", description = "سرویس مدیریت اطلاعات بخش ها")})
@RequiredArgsConstructor
public class DepartmentController extends BaseController<DepartmentReqVM, DepartmentResVM, Long> {

    private final DepartmentService departmentService;


    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/findByDepartmentCode")
    public ResponseEntity<BaseDTO<DepartmentResVM>> findByDepartmentCode(@RequestParam Long code) {
        return ResponseEntity.ok(departmentService.findByDepartmentCode(code));
    }
}
