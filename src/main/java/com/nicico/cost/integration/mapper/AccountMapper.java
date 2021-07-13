package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.Account;
import com.nicico.cost.integration.domain.view.account.AccountReqVM;
import com.nicico.cost.integration.domain.view.account.AccountResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AccountMapper extends GeneralMapper<Account, AccountReqVM, AccountResVM> {
}
