package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;

import java.io.ByteArrayInputStream;

public interface ExcelTemplateService extends GeneralService<ExcelTemplateReqVM, ExcelTemplateResVM, Long> {

    BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type);

    ByteArrayInputStream modelDataToExcel(BaseDTO<ExcelTemplateResVM> template);
}
