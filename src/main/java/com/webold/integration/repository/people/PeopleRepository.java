package com.webold.integration.repository.people;

import com.webold.integration.domain.entity.People;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface PeopleRepository extends JdbcRepository<People, Long> {
    Optional<People> findByNationalCode(String nationalCode);

}
