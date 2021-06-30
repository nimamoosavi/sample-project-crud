package com.nicico.cost.integration.repository.peopleaccesslist;

import com.nicico.cost.integration.domain.entity.PeopleAccessList;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeopleAccessListRepository extends JdbcRepository<PeopleAccessList, Long> {

    Optional<PeopleAccessList> findByPeopleIdAndOrganizationId(Long peopleId, Long organizationId);

    Boolean existsByPeopleIdAndOrganizationId(Long peopleId, Long organizationId);

    List<PeopleAccessList> findAllByPeople_IdAndWriteAccessTrue(Long peopleId);

    List<PeopleAccessList> findAllByPeople_IdAndReadAccessTrue(Long peopleId);


}
