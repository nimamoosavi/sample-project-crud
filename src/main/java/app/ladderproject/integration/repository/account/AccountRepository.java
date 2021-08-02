package app.ladderproject.integration.repository.account;

import app.ladderproject.integration.domain.entity.Account;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JdbcRepository<Account, Long> {
}
