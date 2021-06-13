package com.nicico.cost.integration.domain.view.organization;

import com.nicico.cost.integration.domain.entity.Department;
import com.nicico.cost.integration.domain.entity.Organization;
import lombok.Data;

import java.util.List;

@Data
public class OrganizationResVM {


    private Long id;

    private Organization parentOrganization;

    private String organizationCode;

    private String organizationName;


    private Department department;

    private String organizationNameLatin;

    private Boolean deActive;


    private Long createUserId;

    private String createDate;

    private Long editUserId;

    private String editDate;

    private Boolean branchFree;

    private Boolean isFolder = true;

    private List<Organization> children;

    private Long orgNumber;

    private Long childrenDigitCount;

    private Boolean dashChildrenCode;

    private Long level;
}
