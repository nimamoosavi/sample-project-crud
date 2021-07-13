package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.account.AccountReqVM;
import com.nicico.cost.integration.domain.view.account.AccountResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/account")
@Api(value = "account", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "account", description = "سرویس مدیریت حساب ها")})
public class AccountController extends BaseController<AccountReqVM, AccountResVM, Long> {

    @Override
    @Unauthorized
    public ResponseEntity<BaseDTO<AccountResVM>> create(AccountReqVM accountReqVM) {
        return super.create(accountReqVM);
    }

    @Override
    @Unauthorized
    public ResponseEntity<BaseDTO<AccountResVM>> update(AccountReqVM accountReqVM) {
        return super.update(accountReqVM);
    }

    @Override
    @Unauthorized
    public ResponseEntity<BaseDTO<Boolean>> deleteById(Long id) {
        return super.deleteById(id);
    }
}
