package com.nicico.cost.integration.domain.view.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CostTypeReqVM {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String code;
    @NotNull
    private Long sort;
}
