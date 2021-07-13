package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.Account;
import com.nicico.cost.integration.domain.view.account.AccountReqVM;
import com.nicico.cost.integration.domain.view.account.AccountResVM;
import com.nicico.cost.integration.service.AccountService;
import org.springframework.stereotype.Service;

@Service
class AccountServiceImpl extends GeneralServiceImpl<Account, AccountReqVM, AccountResVM, Long> implements AccountService {
}
