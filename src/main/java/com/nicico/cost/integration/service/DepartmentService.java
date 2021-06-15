package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.integration.domain.view.department.DepartmentReqVM;
import com.nicico.cost.integration.domain.view.department.DepartmentResVM;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends GeneralService<Department, DepartmentReqVM, DepartmentResVM, Long> {
}
