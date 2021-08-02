package app.ladderproject.integration.service.impl;

import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.integration.exception.IntegrationException;
import app.ladderproject.integration.repository.exceltemplate.ExcelTemplateJdbcService;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.entity.ExcelTemplate;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import app.ladderproject.integration.service.ExcelTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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
            if (!excelTemplateReqVM.isNeedRegex() && !entry.getKey().equals(newMapKey)) {
                throw applicationException.createApplicationException(IntegrationException.EXCEL_TEMPLATE_ERROR, HttpStatus.BAD_REQUEST);
            }
            newAttributes.put(newMapKey, entry.getValue());
        }
        excelTemplateReqVM.setAttributes(newAttributes);
        return super.save(excelTemplateReqVM);
    }

    private String mapKeyFilter(String mapKey) {
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
