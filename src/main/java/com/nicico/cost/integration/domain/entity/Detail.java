package com.nicico.cost.integration.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "TBL_DETAIL")
@Subselect("select * from detail")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "det_seq")
    @SequenceGenerator(name = "det_seq", sequenceName = "SEQ_DETAIL_ID", allocationSize = 1)
    @Column(name = "DET_ID", precision = 10)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET_PARENT_ID")
    private Detail parentDetail;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "DETAIL_TYPE_RELATION",
            joinColumns = @JoinColumn(name = "DET_ID", foreignKey = @ForeignKey(name = "FK_DETAIL_TYPE")),
            inverseJoinColumns = @JoinColumn(name = "TYPE_ID", foreignKey = @ForeignKey(name = "FK_TYPE_DETAIL")))

    private List<DetailType> detailTypes;


    @Column(name = "DET_NUM", precision = 20)
    private Long detailNumber;

    @Column(name = "DET_DETAILNAME", nullable = false, length = 255)
    private String detailName;

    @Column(name = "DET_DETAILNAME_LATIN", length = 255)
    private String detailNameLatin;

    @Column(name = "DET_CHILDRENDIGITCOUNT", nullable = false)
    private Long childrenDigitCount;

    @Column(name = "DET_ORGCODE_ID")
    private Long orgCodeId;

    @Column(name = "DET_DEACTIVE", length = 1)
    private String deactive;

    @Column(name = "DET_DEACTIVEDATE")
    private String deactiveDate;

    @Column(name = "DET_MAXDEBREMAIN", precision = 30, columnDefinition = "FLOAT")
    private Double maxDebRemain;

    @Column(name = "DET_MAXCERREMAIN", precision = 30, columnDefinition = "FLOAT")
    private Double maxCerRemain;

    @Column(name = "DET_MINDEBREMAIN", precision = 30, columnDefinition = "FLOAT")
    private Double minDebRemain;

    @Column(name = "DET_MINCERREMAIN", precision = 30, columnDefinition = "FLOAT")
    private Double minCerRemain;

    @Column(name = "DET_SOURCE_KIND")
    private String sourceKind;

    @Column(name = "DET_BALANCE_KIND")
    private String balanceKind;

    @Column(name = "DET_STANDARDDESC")
    private String standardDesc;

    @Column(name = "DET_NOTE")
    private String note;

    @Column(name = "DET_BALANCESTATUS", length = 1)
    private String balanceStatus;

    @Column(name = "DET_FINANCIALSTRUCTURE_ID")
    private Long financialStructureId;

    @Column(name = "DET_CODE")
    private String code;

    @Column(name = "DET_LEVEL")
    private Long level;

    @Column(name = "DET_DASHCHILDRENCODE")
    private Boolean dashChildrenCode;

    @Column(name = "DET_BRANCH_FREE")
    private Boolean branchFree;


    @Column(name = "DET_BLOCKED")
    private String blocked = String.valueOf(Boolean.FALSE);


    @Formula("case when DET_CHILDRENDIGITCOUNT=0 then false else true end")
    private Boolean isFolder;
}
