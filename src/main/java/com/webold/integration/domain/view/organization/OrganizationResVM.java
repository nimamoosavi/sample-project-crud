package com.webold.integration.domain.view.organization;

import lombok.Data;

@Data
public class OrganizationResVM {


    private Long id;

    private Long parentOrganizationId;

    private String organizationCode;

    private String organizationName;


    private Long departmentId;

    private String organizationNameLatin;

    private Boolean deActive;

    private Boolean branchFree;

    private Boolean isFolder;

    private Long orgNumber;

    private Long childrenDigitCount;

    private Boolean dashChildrenCode;

    private Long level;
}
