package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.account.AccountReqVM;
import com.nicico.cost.integration.domain.view.account.AccountResVM;

public interface AccountService extends GeneralService<AccountReqVM, AccountResVM, Long> {
}
