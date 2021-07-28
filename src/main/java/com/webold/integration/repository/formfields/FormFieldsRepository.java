package com.webold.integration.repository.formfields;

import com.webold.integration.domain.entity.FormFields;
import com.webold.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FormFieldsRepository extends JdbcRepository<FormFields, Long> {
}
