package com.webold.integration.domain.view.cost;

import com.webold.integration.domain.enums.CenterDetail;
import com.webold.integration.domain.view.formfield.FormFieldsResVM;
import lombok.Data;

import java.util.List;

@Data
public class CostResVM {
    private Long id;

    private String name;

    private String code;

    private Long det1Id;

    private Long det2Id;

    private Long det3Id;

    private Long det4Id;

    private Long det5Id;

    private CenterDetail centerDetail;

    private Long accountId;

    private List<FormFieldsResVM> fieldsResVMList;
}
