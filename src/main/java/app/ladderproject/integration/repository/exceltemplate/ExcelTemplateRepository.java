package app.ladderproject.integration.repository.exceltemplate;

import app.ladderproject.integration.domain.entity.ExcelTemplate;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ExcelTemplateRepository extends JdbcRepository<ExcelTemplate, Long> {

    ExcelTemplate findByProcessNameAndType(String processName, String type);
}
