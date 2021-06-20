package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;

import javax.validation.constraints.NotNull;

public interface PeopleService extends GeneralService<PeopleReqVM, PeopleResVM, Long> {

    BaseDTO<PeopleResVM> findByNationalCode(@NotNull String nationalCode);
}
