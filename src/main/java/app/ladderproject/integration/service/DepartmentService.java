package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.view.department.DepartmentReqVM;
import app.ladderproject.integration.domain.view.department.DepartmentResVM;

import javax.validation.constraints.NotNull;

public interface DepartmentService extends GeneralService<DepartmentReqVM, DepartmentResVM, Long> {

    BaseDTO<DepartmentResVM> findByDepartmentCode(@NotNull Long code);
}
