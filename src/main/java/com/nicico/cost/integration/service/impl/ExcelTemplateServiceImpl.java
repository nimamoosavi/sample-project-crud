package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import com.nicico.cost.integration.repository.exceltemplate.ExcelTemplateJdbcService;
import com.nicico.cost.integration.service.ExcelTemplateService;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.util.CellReference;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
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
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < excelTemplateReqVM.getData().size(); i++) {
            map.put(CellReference.convertNumToColString(i), excelTemplateReqVM.getData().get(i));
        }
        excelTemplateReqVM.setAttributes(map);
        return super.save(excelTemplateReqVM);
    }


}
