package com.nicico.cost.integration.service;


import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.anotations.Log;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.packages.audit.view.AuditFactory;
import com.nicico.cost.integration.domain.entity.User;
import com.nicico.cost.integration.domain.view.request.UserReqVM;
import com.nicico.cost.integration.domain.view.response.UserResVM;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GeneralService<User, UserReqVM, UserResVM, Long> {
    @Override
    @Log(type = AuditFactory.AuditType.ALL)
    public BaseDTO<UserResVM> save(UserReqVM userReqVM) {
        return super.save(userReqVM);
    }
}
