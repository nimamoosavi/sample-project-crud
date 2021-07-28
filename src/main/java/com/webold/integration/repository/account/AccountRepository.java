package com.webold.integration.repository.account;

import com.webold.integration.domain.entity.Account;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JdbcRepository<Account, Long> {
}
