package com.nicico.cost.integration.repository;


import com.nicico.cost.integration.domain.entity.User;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JdbcRepository<User, Long> {
}
