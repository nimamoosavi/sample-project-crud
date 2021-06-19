package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import org.springframework.stereotype.Service;

@Service
public class PeopleService extends GeneralService<People, PeopleReqVM, PeopleResVM, Long> {
}
