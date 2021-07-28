package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.FormFields;
import com.webold.integration.domain.view.formfield.FormFieldsReqVM;
import com.webold.integration.domain.view.formfield.FormFieldsResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class FormFieldsMapper extends GeneralMapper<FormFields, FormFieldsReqVM, FormFieldsResVM> {

}
