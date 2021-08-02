package app.ladderproject.integration.mapper;

import app.ladderproject.crud.mapper.GeneralMapper;
import app.ladderproject.integration.domain.entity.ExcelTemplate;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public abstract class ExcelTemplateMapper extends GeneralMapper<ExcelTemplate, ExcelTemplateReqVM, ExcelTemplateResVM> {

}
