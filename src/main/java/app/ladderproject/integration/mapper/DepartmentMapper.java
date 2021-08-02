package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.Department;
import app.ladderproject.integration.domain.view.department.DepartmentReqVM;
import app.ladderproject.integration.domain.view.department.DepartmentResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class DepartmentMapper extends GeneralMapper<Department, DepartmentReqVM, DepartmentResVM> {
}
