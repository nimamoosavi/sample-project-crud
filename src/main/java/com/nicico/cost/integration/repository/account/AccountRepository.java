package com.nicico.cost.integration.repository.account;

import com.nicico.cost.integration.domain.entity.Account;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JdbcRepository<Account, Long> {
}
