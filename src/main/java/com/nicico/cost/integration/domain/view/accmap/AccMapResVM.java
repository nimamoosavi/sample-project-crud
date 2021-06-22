package com.nicico.cost.integration.domain.view.accmap;

import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import lombok.Data;

@Data
public class AccMapResVM {
    private Long id;
    private String name;
    private String description;
    private String code;
    private DetailTypeResVM detailTypeResVM;
}
