package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import com.nicico.cost.integration.mapper.PeopleAccessListMapper;
import com.nicico.cost.integration.repository.peopleaccesslist.PeopleAccessListJdbcService;
import com.nicico.cost.integration.service.PeopleAccessListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleAccessListServiceImpl extends
        GeneralServiceImpl<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM, Long> implements
        PeopleAccessListService {

    private final PeopleAccessListJdbcService peopleAccessListJdbcService;
    private final PeopleAccessListMapper peopleAccessListMapper;

    @Override
    public BaseDTO<PeopleAccessListResVM> save(@NotNull PeopleAccessListReqVM peopleAccessListReqVM) {
        PeopleAccessList peopleAccessList = peopleAccessListMapper.requestToBaseObject(peopleAccessListReqVM);
        peopleAccessListJdbcService.save(peopleAccessList);
        return generalMapper.mapBaseObjectToResponse(peopleAccessList);
    }

    @Override
    public BaseDTO<List<PeopleAccessListResVM>> findAllByPeople_IdAndWriteAccessTrue(Long peopleId) {
        List<PeopleAccessList> people = peopleAccessListJdbcService.findAllByPeople_IdAndWriteAccessTrue(peopleId);
        return generalMapper.mapListBaseObjectToResponse(people);
    }

    @Override
    public BaseDTO<List<PeopleAccessListResVM>> findAllByPeople_IdAndReadAccessTrue(Long peopleId) {
        List<PeopleAccessList> people = peopleAccessListJdbcService.findAllByPeople_IdAndReadAccessTrue(peopleId);
        return generalMapper.mapListBaseObjectToResponse(people);
    }
}
