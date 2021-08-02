package app.ladderproject.integration.repository.formfields;

import app.ladderproject.integration.domain.entity.FormFields;
import app.ladderproject.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FormFieldsJdbcService extends JdbcServiceImpl<FormFields, Long> {
}
