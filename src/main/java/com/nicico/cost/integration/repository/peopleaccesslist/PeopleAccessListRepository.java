package com.nicico.cost.integration.repository.peopleaccesslist;

import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PeopleAccessListRepository extends JdbcRepository<PeopleAccessList, Long> {

    List<PeopleAccessList> findAllByPeople_IdAndWriteAccessTrue(Long peopleId);

    List<PeopleAccessList> findAllByPeople_IdAndReadAccessTrue(Long peopleId);


}
