package com.webold.integration.domain.view.accmap;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccMapDetailType {
    private Long detailTypeId;
    @NotNull
    private Long accMapId;
}
