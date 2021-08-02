package app.ladderproject.integration.repository.formfields;

import app.ladderproject.integration.domain.entity.FormFields;
import app.ladderproject.jdbcclient.repository.JdbcRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FormFieldsRepository extends JdbcRepository<FormFields, Long> {
}
