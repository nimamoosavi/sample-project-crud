package com.nicico.cost.integration.domain.view.accmap;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AccMapReqVM {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String code;
    private String description;
    @NotNull
    private Long sort;
}
