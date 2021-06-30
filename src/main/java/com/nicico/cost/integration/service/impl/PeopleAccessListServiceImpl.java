package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import com.nicico.cost.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import com.nicico.cost.integration.repository.peopleaccesslist.PeopleAccessListJdbcService;
import com.nicico.cost.integration.service.PeopleAccessListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.nicico.cost.integration.exception.IntegrationException.NIMA;

@Service
@RequiredArgsConstructor
public class PeopleAccessListServiceImpl extends
        GeneralServiceImpl<PeopleAccessList, PeopleAccessListReqVM, PeopleAccessListResVM, Long> implements
        PeopleAccessListService {

    private final PeopleAccessListJdbcService peopleAccessListJdbcService;

    @Override
    public BaseDTO<PeopleAccessListResVM> update(PeopleAccessListReqVM peopleAccessListReqVM) {
        return super.update(peopleAccessListReqVM);
    }

    @Override
    public BaseDTO<PeopleAccessListResVM> save(PeopleAccessListReqVM peopleAccessListReqVM) {
        if (peopleAccessListReqVM.isWriteAccess()) {
            peopleAccessListReqVM.setReadAccess(true);
        }
        Optional<PeopleAccessList> peopleAccessList =
                peopleAccessListJdbcService.findByPeopleIdAndOrganizationId(peopleAccessListReqVM.getPeopleId(), peopleAccessListReqVM.getOrganizationId());
        if (peopleAccessList.isPresent()) {
            peopleAccessListReqVM.setId(peopleAccessList.get().getId());
            return super.update(peopleAccessListReqVM);
        }
        return super.save(peopleAccessListReqVM);
    }


//    @Override
//    public BaseDTO<PeopleAccessListResVM> getPeopleAccessListByPeopleIdAndOrganizationId(Long peopleId, Long organizationId) {
//        PeopleAccessList peopleAccessList = peopleAccessListJdbcService.getPeopleAccessListByPeopleIdAndOrganizationId(peopleId, organizationId);
//        return generalMapper.mapBaseObjectToResponse(peopleAccessList);
//    }

    @Override
    public BaseDTO<PeopleAccessListResVM> getPeopleAccessListByPeopleIdAndOrganizationId(Long peopleId, Long organizationId) {
        return null;
    }

    @Override
    public Boolean existByPeopleIdAndOrganizationId(Long peopleId, Long organizationId) {
        return peopleAccessListJdbcService.existsByPeopleIdAndOrganizationId(peopleId, organizationId);
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
