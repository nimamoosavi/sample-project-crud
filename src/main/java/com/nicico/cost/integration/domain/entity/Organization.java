package com.nicico.cost.integration.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@Entity
@Table(name = "ORGANIZATION")
@Setter
@Getter
@Subselect("select * from organization")
public class Organization {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORG_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORG_PARENT_ID")
    private Organization parentOrganization;

    @Column(name = "ORG_CODE")
    private String organizationCode;

    @Column(name = "ORG_NAME")
    private String organizationName;

    @ManyToOne
    @JoinColumn(name = "DEP_ID")
    private Department department;

    @Column(name = "ORG_NAME_LATIN")
    private String organizationNameLatin;

    @Column(name = "ORG_DEACTIVE", length = 1, columnDefinition = "VARCHAR2(1)")
    private Boolean deActive;

    @Column(name = "CREATE_USER")
    private Long createUserId;

    @Column(name = "CREATE_DATE")
    private String createDate;

    @Column(name = "EDIT_USER")
    private Long editUserId;

    @Column(name = "EDIT_DATE")
    private String editDate;

    @Column(name = "ORG_BRANCH_FREE", length = 1)
    private Boolean branchFree;

    @Formula("case when ORG_BRANCH_FREE=0 then false else true end")
    private Boolean isFolder = true;

    @Column(name = "ORG_NUM")
    private Long orgNumber;

    @Column(name = "ORG_CHILDREN_DIGIT_COUNT")
    private Long childrenDigitCount;

    @Column(name = "ORG_DASHCHILDRENCODE")
    private Boolean dashChildrenCode;

    @Column(name = "ORG_LEVEL")
    private Long level;
}
