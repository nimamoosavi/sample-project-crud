package com.nicico.cost.integration.domain.view.peopleaccesslist;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PeopleAccessListReqVM {

    private Long id;
    @NotNull
    private Long peopleId;
    @NotNull
    private Long organizationId;
    private boolean readAccess;
    private boolean writeAccess;
}
