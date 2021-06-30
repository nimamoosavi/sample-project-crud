package com.nicico.cost.integration.domain.view.accmap;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccMapValidate {
    @NotNull
    private Long accMapId;
    @NotNull
    private Long detailId;
}
