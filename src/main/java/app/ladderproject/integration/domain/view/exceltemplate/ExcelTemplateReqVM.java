package app.ladderproject.integration.domain.view.exceltemplate;

import lombok.Data;

import java.util.Map;

@Data
public class ExcelTemplateReqVM {

    private Long id;
    private String processName;
    private String type;
    private boolean needRegex;
    private Map<String, String> attributes;
}
