package com.nicico.cost.integration.domain.view.exceltemplate;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
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
    private List<String> data;
    private Map<String, String> attributes;
}
