package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.account.AccountReqVM;
import app.ladderproject.integration.domain.view.account.AccountResVM;

public interface AccountService extends GeneralService<AccountReqVM, AccountResVM, Long> {
}
