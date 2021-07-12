package com.nicico.cost.integration.repository.peopleaccesslist;

import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface PeopleAccessListRepository extends JdbcRepository<PeopleAccessList, Long> {

    List<PeopleAccessList> findAllByPeopleIdAndWriteAccessTrue(Long peopleId);

    List<PeopleAccessList> findAllByPeopleIdAndReadAccessTrue(Long peopleId);


}
