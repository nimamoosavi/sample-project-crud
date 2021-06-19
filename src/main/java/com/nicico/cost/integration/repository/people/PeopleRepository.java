package com.nicico.cost.integration.repository.people;

import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JdbcRepository<People, Long> {
}
