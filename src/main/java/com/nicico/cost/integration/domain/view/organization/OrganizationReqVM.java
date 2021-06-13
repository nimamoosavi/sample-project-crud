package com.nicico.cost.integration.domain.view.organization;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class OrganizationReqVM {

    @NotNull
    private Long parentOrganizationId;
    @NotNull
    @NotBlank
    private String organizationCode;
    @NotNull
    @NotBlank
    private String organizationName;
    @NotNull
    private Long departmentId;
    @NotNull
    @NotBlank
    private String organizationNameLatin;
    private Boolean deActive;
    @NotNull
    private Long createUserId;
    @NotNull
    @NotBlank
    private String createDate;
    @NotNull
    private Long editUserId;
    @NotNull
    @NotBlank
    private String editDate;
    private Boolean branchFree;
    private Boolean isFolder = true;
    private List<Long> childrenIds;
    @NotNull
    private Long orgNumber;
    @NotNull
    private Long childrenDigitCount;
    private Boolean dashChildrenCode;
    private Long level;
}
