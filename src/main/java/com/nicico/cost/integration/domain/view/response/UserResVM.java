package com.nicico.cost.integration.domain.view.response;

import com.nicico.cost.crud.domain.view.BaseResVM;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserResVM extends BaseResVM<Long> {
    private String username;
    private String password;
}
