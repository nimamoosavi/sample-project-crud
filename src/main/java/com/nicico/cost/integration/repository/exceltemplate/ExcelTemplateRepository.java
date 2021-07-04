package com.nicico.cost.integration.repository.exceltemplate;

import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ExcelTemplateRepository extends JdbcRepository<ExcelTemplate, Long> {

    ExcelTemplate findByProcessNameAndType(String processName, String type);
}
