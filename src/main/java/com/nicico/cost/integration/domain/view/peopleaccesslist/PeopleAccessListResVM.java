package com.nicico.cost.integration.domain.view.peopleaccesslist;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PeopleAccessListResVM {

    private Long id;
    @NotNull
    @NotBlank
    private Long peopleId;
    @NotNull
    @NotBlank
    private Long organizationId;
    private boolean readAccess;
    private boolean writeAccess;
}
