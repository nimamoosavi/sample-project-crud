package app.ladderproject.integration.service.impl;

import app.ladderproject.crud.service.impl.GeneralServiceImpl;
import app.ladderproject.integration.domain.entity.FormFields;
import app.ladderproject.integration.domain.view.formfield.FormFieldsReqVM;
import app.ladderproject.integration.domain.view.formfield.FormFieldsResVM;
import app.ladderproject.integration.service.FormFieldsService;
import org.springframework.stereotype.Service;

@Service
class FormFieldsServiceImpl extends GeneralServiceImpl<FormFields, FormFieldsReqVM, FormFieldsResVM, Long> implements FormFieldsService {
}
