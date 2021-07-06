package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;

import java.util.List;

public interface PeopleAccessListService extends GeneralService<PeopleAccessListReqVM, PeopleAccessListResVM, Long> {

    BaseDTO<List<PeopleAccessListResVM>> findAllByPeople_IdAndWriteAccessTrue(Long peopleId);

    BaseDTO<List<PeopleAccessListResVM>> findAllByPeople_IdAndReadAccessTrue(Long peopleId);
}
