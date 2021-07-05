package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import com.nicico.cost.integration.repository.exceltemplate.ExcelTemplateJdbcService;
import com.nicico.cost.integration.service.ExcelTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static com.nicico.cost.integration.exception.IntegrationException.*;

@Service
@RequiredArgsConstructor
public class ExcelTemplateServiceImpl extends GeneralServiceImpl<ExcelTemplate, ExcelTemplateReqVM, ExcelTemplateResVM, Long> implements ExcelTemplateService {

    private final ExcelTemplateJdbcService service;

    @Override
    public BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type) {
        ExcelTemplate excelTemplate = service.findByProcessNameAndType(processName, type);
        return generalMapper.mapBaseObjectToResponse(excelTemplate);
    }

    @Override
    public BaseDTO<ExcelTemplateResVM> save(@NotNull ExcelTemplateReqVM excelTemplateReqVM) {
        Map<String, String> newAttributes = new HashMap<>();
        for (Map.Entry<String, String> entry : excelTemplateReqVM.getAttributes().entrySet()) {
            String newMapKey = mapKeyFilter(entry.getKey());
            if (excelTemplateReqVM.isNeedRegex()) {
                if (!entry.getKey().equals(newMapKey)) {
                    throw applicationException.createApplicationException(EXCEL_TEMPLATE_ERROR, HttpStatus.BAD_REQUEST);
                }
            } else {
                newAttributes.put(newMapKey, entry.getValue());
            }
        }
        excelTemplateReqVM.setAttributes(newAttributes);
        return super.save(excelTemplateReqVM);
    }

    public String mapKeyFilter(String mapKey) {
        char[] charArray = mapKey.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            if (!Character.isDigit(c)) {
                result.append(c);
            }
        }
        return result.toString().toUpperCase(Locale.ROOT).trim();
    }

}
