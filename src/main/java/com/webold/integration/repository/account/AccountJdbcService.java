package com.webold.integration.repository.account;

import com.webold.integration.domain.entity.Account;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccountJdbcService extends JdbcServiceImpl<Account, Long> {

}
