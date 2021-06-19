package com.nicico.cost.integration.repository.people;

import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeopleRepository extends JdbcRepository<People, Long> {
    Optional<People> findByNationalCode(String nationalCode);

    List<People> findAllByFirstName(String name);

    List<People> findAllByFirstNameContaining(String name);

    Page<People> findAllByFirstName(String name, Pageable pageable);

    Page<People> findAllByFirstNameContaining(String name, Pageable pageable);

    List<People> findAllByLastName(String lastName);

    List<People> findAllByLastNameContaining(String lastName);

    Page<People> findAllByLastName(String lastName, Pageable pageable);

    Page<People> findAllByLastNameContaining(String lastName, Pageable pageable);

}
