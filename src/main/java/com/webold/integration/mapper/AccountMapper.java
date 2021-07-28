package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.Account;
import com.webold.integration.domain.view.account.AccountReqVM;
import com.webold.integration.domain.view.account.AccountResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class AccountMapper extends GeneralMapper<Account, AccountReqVM, AccountResVM> {
}
