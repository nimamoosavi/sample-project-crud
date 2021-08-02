package app.ladderproject.integration.service.impl;

import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.integration.domain.entity.Account;
import app.ladderproject.integration.domain.view.account.AccountReqVM;
import app.ladderproject.integration.domain.view.account.AccountResVM;
import app.ladderproject.integration.service.AccountService;
import org.springframework.stereotype.Service;

@Service
class AccountServiceImpl extends GeneralServiceImpl<Account, AccountReqVM, AccountResVM, Long> implements AccountService {
}
