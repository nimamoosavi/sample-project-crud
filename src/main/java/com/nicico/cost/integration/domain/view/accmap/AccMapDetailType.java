package com.nicico.cost.integration.domain.view.accmap;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccMapDetailType {
    private Long detailTypeId;
    @NotNull
    private Long accMapId;
}
