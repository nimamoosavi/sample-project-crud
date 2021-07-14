package com.nicico.cost.integration.service;

import com.nicico.cost.crud.service.GeneralService;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsReqVM;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsResVM;

public interface FormFieldsService extends GeneralService<FormFieldsReqVM, FormFieldsResVM, Long> {
}
