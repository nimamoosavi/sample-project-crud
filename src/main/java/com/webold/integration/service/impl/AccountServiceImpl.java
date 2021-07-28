package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.integration.domain.entity.Account;
import com.webold.integration.domain.view.account.AccountReqVM;
import com.webold.integration.domain.view.account.AccountResVM;
import com.webold.integration.service.AccountService;
import org.springframework.stereotype.Service;

@Service
class AccountServiceImpl extends GeneralServiceImpl<Account, AccountReqVM, AccountResVM, Long> implements AccountService {
}
