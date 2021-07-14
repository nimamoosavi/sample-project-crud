package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.FormFields;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsReqVM;
import com.nicico.cost.integration.domain.view.formfield.FormFieldsResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class FormFieldsMapper extends GeneralMapper<FormFields, FormFieldsReqVM, FormFieldsResVM> {

}
