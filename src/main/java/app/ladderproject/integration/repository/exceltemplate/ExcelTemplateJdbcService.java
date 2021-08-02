package app.ladderproject.integration.repository.exceltemplate;

import app.ladderproject.integration.domain.entity.ExcelTemplate;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
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
