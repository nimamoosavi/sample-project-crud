package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.integration.domain.view.account.AccountReqVM;
import com.webold.integration.domain.view.account.AccountResVM;

public interface AccountService extends GeneralService<AccountReqVM, AccountResVM, Long> {
}
