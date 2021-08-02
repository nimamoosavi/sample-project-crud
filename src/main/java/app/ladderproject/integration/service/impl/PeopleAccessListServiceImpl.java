package app.ladderproject.integration.service.impl;

import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.integration.repository.peopleaccesslist.PeopleAccessListJdbcService;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.entity.PeopleAccessList;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListReqVM;
import app.ladderproject.integration.domain.view.peopleaccesslist.PeopleAccessListResVM;
import app.ladderproject.integration.service.PeopleAccessListService;
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
