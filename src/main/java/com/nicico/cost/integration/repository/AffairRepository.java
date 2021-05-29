package com.nicico.cost.integration.repository;


import com.nicico.cost.integration.domain.entity.Affair;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AffairRepository extends JdbcRepository<Affair, Long> {
}
