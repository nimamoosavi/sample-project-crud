package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.people.PeopleReqVM;
import com.webold.integration.domain.view.people.PeopleResVM;

import javax.validation.constraints.NotNull;

public interface PeopleService extends GeneralService<PeopleReqVM, PeopleResVM, Long> {

    BaseDTO<PeopleResVM> findByNationalCode(@NotNull String nationalCode);
}
