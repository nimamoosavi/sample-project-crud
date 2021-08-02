package app.ladderproject.integration.repository.peopleaccesslist;

import app.ladderproject.integration.domain.entity.PeopleAccessList;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PeopleAccessListJdbcService extends JdbcServiceImpl<PeopleAccessList, Long> {

    private final PeopleAccessListRepository peopleAccessListRepository;

    public List<PeopleAccessList> findAllByPeopleIdAndWriteAccessTrue(Long peopleId) {
        return peopleAccessListRepository.findAllByPeopleIdAndWriteAccessTrue(peopleId);
    }

    public List<PeopleAccessList> findAllByPeopleIdAndReadAccessTrue(Long peopleId) {
        return peopleAccessListRepository.findAllByPeopleIdAndReadAccessTrue(peopleId);
    }
}
