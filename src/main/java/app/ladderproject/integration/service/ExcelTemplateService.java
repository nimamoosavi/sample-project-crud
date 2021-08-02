package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateResVM;

public interface ExcelTemplateService extends GeneralService<ExcelTemplateReqVM, ExcelTemplateResVM, Long> {

    BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type);
}
