package com.webold.integration.domain.view.detail;

import com.webold.integration.domain.view.detailtype.DetailTypeResVM;
import com.webold.crud.domain.view.TreeResVM;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DetailResVM extends TreeResVM<Long> {

    private Long id;

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

    private String blocked;

    private String actionControl;

    private Boolean isFolder;
}
