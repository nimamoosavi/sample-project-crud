package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.integration.domain.view.department.DepartmentReqVM;
import com.nicico.cost.integration.domain.view.department.DepartmentResVM;
import com.nicico.cost.integration.repository.department.DepartmentJdbcService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

import static com.nicico.cost.framework.enums.exception.ExceptionEnum.NOTFOUND;

@Service
@RequiredArgsConstructor
public class DepartmentService extends GeneralService<Department, DepartmentReqVM, DepartmentResVM, Long> {

    private final DepartmentJdbcService departmentJdbcService;

    public BaseDTO<DepartmentResVM> findByDepartmentCode(@NotNull Long code) {
        Department department = departmentJdbcService.findByDepartmentCode(code).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        return generalMapper.mapBaseObjectToResponse(department);
    }
}
