package com.nicico.cost.integration.repository.formfields;

import com.nicico.cost.integration.domain.entity.FormFields;
import com.nicico.cost.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FormFieldsRepository extends JdbcRepository<FormFields, Long> {
}
