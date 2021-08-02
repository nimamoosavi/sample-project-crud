package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.FormFields;
import app.ladderproject.integration.domain.view.formfield.FormFieldsReqVM;
import app.ladderproject.integration.domain.view.formfield.FormFieldsResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class FormFieldsMapper extends GeneralMapper<FormFields, FormFieldsReqVM, FormFieldsResVM> {

}
