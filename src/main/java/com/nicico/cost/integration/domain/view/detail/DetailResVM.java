package com.nicico.cost.integration.domain.view.detail;

import com.nicico.cost.integration.domain.view.department.DepartmentResVM;
import com.nicico.cost.integration.domain.view.detailtype.DetailTypeResVM;
import lombok.Data;

import java.util.List;

@Data
public class DetailResVM {

    private Long id;

    private Long parentDetailId;


    private List<DetailTypeResVM> detailTypeResVMS;


    private Long detailNumber;


    private String detailName;

    private String detailNameLatin;

    private Long childrenDigitCount;

    private Long orgCodeId;

    private Double maxDebRemain;

    private Double maxCerRemain;

    private Double minDebRemain;

    private Double minCerRemain;

    private String sourceKind;

    private String balanceKind;

    private String standardDesc;

    private String note;

    private String balanceStatus;

    private Long financialStructureId;

    private String code;

    private Long level;

    private Boolean dashChildrenCode;

    private Boolean branchFree;


    private DepartmentResVM departmentResVM;

    private String unitState;


    private String currencyState;

    private String blocked;

    private String actionControl;

    private Boolean isFolder;
}
