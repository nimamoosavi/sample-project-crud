package com.nicico.cost.integration.repository.exceltemplate;

import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExcelTemplateJdbcService extends JdbcServiceImpl<ExcelTemplate, Long> {

    private final ExcelTemplateRepository repository;

    public ExcelTemplate findByProcessNameAndType(String processName, String type){
        return repository.findByProcessNameAndType(processName, type);
    }
}
