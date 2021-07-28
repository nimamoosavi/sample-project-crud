package com.webold.integration.repository.exceltemplate;

import com.webold.integration.domain.entity.ExcelTemplate;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ExcelTemplateRepository extends JdbcRepository<ExcelTemplate, Long> {

    ExcelTemplate findByProcessNameAndType(String processName, String type);
}
