package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.authorize.HttpRequestType;
import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.integration.domain.view.department.DepartmentReqVM;
import com.nicico.cost.integration.domain.view.department.DepartmentResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/department")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Department", description = "سرویس مدیریت اطلاعات بخش ها")})
@Unauthorized(types = {HttpRequestType.POST, HttpRequestType.DELETE, HttpRequestType.PUT})
@RequiredArgsConstructor
public class DepartmentController extends BaseController<Department, DepartmentReqVM, DepartmentResVM, Long> {

    @Override
    public ResponseEntity<BaseDTO<DepartmentResVM>> create(DepartmentReqVM departmentReqVM) {
        return super.create(departmentReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<DepartmentResVM>> update(DepartmentReqVM departmentReqVM) {
        return super.update(departmentReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<Boolean>> deleteById(Long id) {
        return super.deleteById(id);
    }
}
