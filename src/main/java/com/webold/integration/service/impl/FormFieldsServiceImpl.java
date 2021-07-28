package com.webold.integration.service.impl;

import com.webold.crud.service.impl.GeneralServiceImpl;
import com.webold.integration.domain.entity.FormFields;
import com.webold.integration.domain.view.formfield.FormFieldsReqVM;
import com.webold.integration.domain.view.formfield.FormFieldsResVM;
import com.webold.integration.service.FormFieldsService;
import org.springframework.stereotype.Service;

@Service
class FormFieldsServiceImpl extends GeneralServiceImpl<FormFields, FormFieldsReqVM, FormFieldsResVM, Long> implements FormFieldsService {
}
