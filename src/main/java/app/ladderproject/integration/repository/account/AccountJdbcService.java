package app.ladderproject.integration.repository.account;

import app.ladderproject.integration.domain.entity.Account;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccountJdbcService extends JdbcServiceImpl<Account, Long> {

}
