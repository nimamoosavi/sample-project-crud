package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.department.DepartmentReqVM;
import com.webold.integration.domain.view.department.DepartmentResVM;

import javax.validation.constraints.NotNull;

public interface DepartmentService extends GeneralService<DepartmentReqVM, DepartmentResVM, Long> {

    BaseDTO<DepartmentResVM> findByDepartmentCode(@NotNull Long code);
}
