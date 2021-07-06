package com.nicico.cost.integration.mapper;

import com.nicico.cost.crud.mapper.GeneralMapper;
import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class ExcelTemplateMapper extends GeneralMapper<ExcelTemplate, ExcelTemplateReqVM, ExcelTemplateResVM> {

}
