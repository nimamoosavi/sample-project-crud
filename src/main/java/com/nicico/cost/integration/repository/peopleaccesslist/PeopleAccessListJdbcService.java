package com.nicico.cost.integration.repository.peopleaccesslist;

import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PeopleAccessListJdbcService extends JdbcServiceImpl<PeopleAccessList, Long> {

    private final PeopleAccessListRepository peopleAccessListRepository;

    public List<PeopleAccessList> findAllByPeople_IdAndWriteAccessTrue(Long peopleId) {
        return peopleAccessListRepository.findAllByPeople_IdAndWriteAccessTrue(peopleId);
    }

    public List<PeopleAccessList> findAllByPeople_IdAndReadAccessTrue(Long peopleId) {
        return peopleAccessListRepository.findAllByPeople_IdAndReadAccessTrue(peopleId);
    }
}
