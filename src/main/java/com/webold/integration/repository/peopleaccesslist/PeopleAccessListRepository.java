package com.webold.integration.repository.peopleaccesslist;

import com.webold.integration.domain.entity.PeopleAccessList;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface PeopleAccessListRepository extends JdbcRepository<PeopleAccessList, Long> {

    List<PeopleAccessList> findAllByPeopleIdAndWriteAccessTrue(Long peopleId);

    List<PeopleAccessList> findAllByPeopleIdAndReadAccessTrue(Long peopleId);


}
