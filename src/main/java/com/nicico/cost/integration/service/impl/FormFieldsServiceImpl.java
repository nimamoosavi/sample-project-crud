package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.integration.domain.entity.FormFields;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsReqVM;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsResVM;
import com.nicico.cost.integration.service.FormFieldsService;
import org.springframework.stereotype.Service;

@Service
class FormFieldsServiceImpl extends GeneralServiceImpl<FormFields, FormFieldsReqVM, FormFieldsResVM, Long> implements FormFieldsService {
}
