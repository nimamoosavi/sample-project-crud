package app.ladderproject.integration.service;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateResVM;

public interface ExcelTemplateService extends GeneralService<ExcelTemplateReqVM, ExcelTemplateResVM, Long> {

    BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type);
}
