package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.view.people.PeopleReqVM;
import app.ladderproject.integration.domain.view.people.PeopleResVM;

import javax.validation.constraints.NotNull;

public interface PeopleService extends GeneralService<PeopleReqVM, PeopleResVM, Long> {

    BaseDTO<PeopleResVM> findByNationalCode(@NotNull String nationalCode);
}
