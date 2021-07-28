package com.webold.integration.mapper;

import com.webold.crud.mapper.GeneralMapper;
import com.webold.integration.domain.entity.ExcelTemplate;
import com.webold.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.webold.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class ExcelTemplateMapper extends GeneralMapper<ExcelTemplate, ExcelTemplateReqVM, ExcelTemplateResVM> {

}
