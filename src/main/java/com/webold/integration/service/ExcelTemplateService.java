package com.webold.integration.service;

import com.webold.crud.service.GeneralService;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.webold.integration.domain.view.exceltemplate.ExcelTemplateResVM;

public interface ExcelTemplateService extends GeneralService<ExcelTemplateReqVM, ExcelTemplateResVM, Long> {

    BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type);
}
