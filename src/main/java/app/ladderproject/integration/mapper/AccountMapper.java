package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.Account;
import app.ladderproject.integration.domain.view.account.AccountReqVM;
import app.ladderproject.integration.domain.view.account.AccountResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AccountMapper extends GeneralMapper<Account, AccountReqVM, AccountResVM> {
}
