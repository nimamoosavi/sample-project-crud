package com.webold.integration.repository.peopleaccesslist;

import com.webold.integration.domain.entity.PeopleAccessList;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
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
