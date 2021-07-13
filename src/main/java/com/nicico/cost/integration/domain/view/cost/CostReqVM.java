package com.nicico.cost.integration.domain.view.cost;

import com.nicico.cost.integration.domain.enums.CenterDetail;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CostReqVM {

    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String code;

    private Long det1Id;

    private Long det2Id;

    private Long det3Id;

    private Long det4Id;

    private Long det5Id;

    private CenterDetail centerDetail;

    @NotNull
    private Long accountId;
}
