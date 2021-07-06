package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;

public interface ExcelTemplateService extends GeneralService<ExcelTemplateReqVM, ExcelTemplateResVM, Long> {

    BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type);
}
