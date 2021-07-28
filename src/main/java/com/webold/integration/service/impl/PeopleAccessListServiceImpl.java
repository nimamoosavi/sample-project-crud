package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.entity.PeopleAccessList;
import com.webold.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.webold.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import com.webold.integration.repository.peopleaccesslist.PeopleAccessListJdbcService;
import com.webold.integration.service.PeopleAccessListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleAccessListServiceImpl extends
        GeneralServiceImpl<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM, Long> implements PeopleAccessListService {

    private final PeopleAccessListJdbcService peopleAccessListJdbcService;

    @Override
    public BaseDTO<PeopleAccessListResVM> save(PeopleAccessListReqVM peopleAccessListReqVM) {
        if (peopleAccessListReqVM.isWriteAccess()) {
            peopleAccessListReqVM.setReadAccess(true);
        }
        return super.save(peopleAccessListReqVM);
    }

    @Override
    public BaseDTO<List<PeopleAccessListResVM>> findAllByPeopleIdAndWriteAccessTrue(Long peopleId) {
        List<PeopleAccessList> people = peopleAccessListJdbcService.findAllByPeopleIdAndWriteAccessTrue(peopleId);
        return generalMapper.mapListBaseObjectToResponse(people);
    }

    @Override
    public BaseDTO<List<PeopleAccessListResVM>> findAllByPeopleIdAndReadAccessTrue(Long peopleId) {
        List<PeopleAccessList> people = peopleAccessListJdbcService.findAllByPeopleIdAndReadAccessTrue(peopleId);
        return generalMapper.mapListBaseObjectToResponse(people);
    }
}
