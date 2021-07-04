package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import com.nicico.cost.integration.repository.exceltemplate.ExcelTemplateJdbcService;
import com.nicico.cost.integration.service.ExcelTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExcelTemplateServiceImpl extends GeneralServiceImpl<ExcelTemplate, ExcelTemplateReqVM, ExcelTemplateResVM, Long> implements ExcelTemplateService {

    private final ExcelTemplateJdbcService service;

    @Override
    public BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type) {
        ExcelTemplate excelTemplate = service.findByProcessNameAndType(processName, type);
        return generalMapper.mapBaseObjectToResponse(excelTemplate);
    }
}
