package com.nicico.cost.integration.domain.view.response;

import com.nicico.cost.framework.domain.view.BaseResVM;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AffairResVM extends BaseResVM<Long> {
    private String name;
    private String code;
}
