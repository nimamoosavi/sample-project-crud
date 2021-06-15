package com.nicico.cost.integration.domain.view.costtype;

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
    private Long parentId;
    @NotNull
    private Long sort;
}
