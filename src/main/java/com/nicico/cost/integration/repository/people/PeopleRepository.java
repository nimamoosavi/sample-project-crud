package com.nicico.cost.integration.repository.people;

import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface PeopleRepository extends JdbcRepository<People, Long> {
    Optional<People> findByNationalCode(String nationalCode);

}
