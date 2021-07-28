package com.webold.integration.domain.view.exceltemplate;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
public class ExcelTemplateResVM {

    private Long id;
    @NotNull
    @NotBlank
    private String processName;
    @NotNull
    @NotBlank
    private String type;
    private boolean needRegex;
    private Map<String, String> attributes;
}
