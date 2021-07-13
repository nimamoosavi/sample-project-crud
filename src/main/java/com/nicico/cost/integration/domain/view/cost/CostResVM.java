package com.nicico.cost.integration.domain.view.cost;

import com.nicico.cost.integration.domain.enums.CenterDetail;
import lombok.Data;

@Data
public class CostResVM {
    private Long id;

    private String name;

    private String code;

    private Long det1Id;

    private Long det2Id;

    private Long det3Id;

    private Long det4Id;

    private Long det5Id;

    private CenterDetail centerDetail;

    private Long accountId;
}
