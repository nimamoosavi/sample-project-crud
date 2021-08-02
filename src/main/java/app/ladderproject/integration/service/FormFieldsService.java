package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.formfield.FormFieldsReqVM;
import app.ladderproject.integration.domain.view.formfield.FormFieldsResVM;

public interface FormFieldsService extends GeneralService<FormFieldsReqVM, FormFieldsResVM, Long> {
}
