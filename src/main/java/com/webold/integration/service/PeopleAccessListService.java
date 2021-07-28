package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.webold.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;

import java.util.List;

public interface PeopleAccessListService extends GeneralService<PeopleAccessListReqVM, PeopleAccessListResVM, Long> {

    BaseDTO<List<PeopleAccessListResVM>> findAllByPeopleIdAndWriteAccessTrue(Long peopleId);

    BaseDTO<List<PeopleAccessListResVM>> findAllByPeopleIdAndReadAccessTrue(Long peopleId);
}
