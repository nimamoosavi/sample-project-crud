package com.nicico.cost.integration.domain.view.exceltemplate;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ExcelTemplateResVM {

    private Long id;
    @NotNull
    @NotBlank
    private String processName;
    @NotNull
    @NotBlank
    private String type;
    private String data;
    private boolean rowNumber;
}
