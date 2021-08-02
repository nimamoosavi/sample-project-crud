package app.ladderproject.integration.controller;

import app.ladderproject.crud.controller.BaseController;
import app.ladderproject.integration.domain.view.formfield.FormFieldsReqVM;
import app.ladderproject.integration.domain.view.formfield.FormFieldsResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/form-fields")
@Api(value = "form-fields", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "form-fields", description = "سرویس مدیریت اطلاعات فرم")})
public class FormFieldsController extends BaseController<FormFieldsReqVM, FormFieldsResVM, Long> {
}
