package com.nicico.cost.integration.repository.formfields;

import com.nicico.cost.integration.domain.entity.FormFields;
import com.nicico.cost.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FormFieldsJdbcService extends JdbcServiceImpl<FormFields, Long> {
}
