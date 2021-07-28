package com.webold.integration.repository.exceltemplate;

import com.webold.integration.domain.entity.ExcelTemplate;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
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
