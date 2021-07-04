package com.nicico.cost.integration.domain.view.exceltemplate;

import lombok.Data;

@Data
public class ExcelTemplateReqVM {

    private Long id;
    private String processName;
    private String type;
    private String data;
    private boolean rowNumber;
}
