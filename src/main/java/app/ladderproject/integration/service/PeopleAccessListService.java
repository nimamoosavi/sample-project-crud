package app.ladderproject.integration.service;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;

import java.util.List;

public interface PeopleAccessListService extends GeneralService<PeopleAccessListReqVM, PeopleAccessListResVM, Long> {

    BaseDTO<List<PeopleAccessListResVM>> findAllByPeopleIdAndWriteAccessTrue(Long peopleId);

    BaseDTO<List<PeopleAccessListResVM>> findAllByPeopleIdAndReadAccessTrue(Long peopleId);
}
