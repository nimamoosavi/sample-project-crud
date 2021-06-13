package com.nicico.cost.integration.domain.view.response;

import lombok.Data;

@Data
public class CostTypeResVM {
    private Long id;
    private String name;
    private String code;
    private Long sort;
}
