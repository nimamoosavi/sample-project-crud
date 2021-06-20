package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.department.DepartmentReqVM;
import com.nicico.cost.integration.domain.view.department.DepartmentResVM;

import javax.validation.constraints.NotNull;

public interface DepartmentService extends GeneralService<DepartmentReqVM, DepartmentResVM, Long> {

    BaseDTO<DepartmentResVM> findByDepartmentCode(@NotNull Long code);
}
