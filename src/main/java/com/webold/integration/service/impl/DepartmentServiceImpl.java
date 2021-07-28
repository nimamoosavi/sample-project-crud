package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.anotations.Unauthorized;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.Department;
import com.webold.integration.domain.view.department.DepartmentReqVM;
import com.webold.integration.domain.view.department.DepartmentResVM;
import com.webold.integration.repository.department.DepartmentJdbcService;
import com.webold.integration.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

import java.util.List;

import static com.webold.framework.enums.exception.ExceptionEnum.NOTFOUND;

@Service
@RequiredArgsConstructor
class DepartmentServiceImpl extends GeneralServiceImpl<Department, DepartmentReqVM, DepartmentResVM, Long> implements DepartmentService {

    private final DepartmentJdbcService departmentJdbcService;



    public BaseDTO<DepartmentResVM> findByDepartmentCode(@NotNull Long code) {
        Department department = departmentJdbcService.findByDepartmentCode(code).orElseThrow(
                () -> applicationException.createApplicationException(NOTFOUND, HttpStatus.NOT_FOUND)
        );
        return generalMapper.mapBaseObjectToResponse(department);
    }


    @Override
    @Unauthorized
    public BaseDTO<DepartmentResVM> save(DepartmentReqVM departmentReqVM) {
        return super.save(departmentReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<List<DepartmentResVM>> saveAll(List<DepartmentReqVM> departmentReqVMS) {
        return super.saveAll(departmentReqVMS);
    }

    @Override
    @Unauthorized
    public BaseDTO<DepartmentResVM> update(DepartmentReqVM departmentReqVM) {
        return super.update(departmentReqVM);
    }

    @Override
    @Unauthorized
    public BaseDTO<Boolean> deleteById(Long id) {
        return super.deleteById(id);
    }
}
