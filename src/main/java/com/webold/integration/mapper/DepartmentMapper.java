package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.Department;
import com.webold.integration.domain.view.department.DepartmentReqVM;
import com.webold.integration.domain.view.department.DepartmentResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class DepartmentMapper extends GeneralMapper<Department, DepartmentReqVM, DepartmentResVM> {
}
