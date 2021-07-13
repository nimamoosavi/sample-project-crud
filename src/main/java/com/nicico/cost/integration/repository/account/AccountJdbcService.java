package com.nicico.cost.integration.repository.account;

import com.nicico.cost.integration.domain.entity.Account;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccountJdbcService extends JdbcServiceImpl<Account, Long> {

}
