package com.webold.integration.repository.formfields;

import com.webold.integration.domain.entity.FormFields;
import com.webold.jdbcclient.service.impl.JdbcServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FormFieldsJdbcService extends JdbcServiceImpl<FormFields, Long> {
}
