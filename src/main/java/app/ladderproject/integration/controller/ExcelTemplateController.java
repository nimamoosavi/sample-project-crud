package app.ladderproject.integration.controller;

import app.ladderproject.core.domain.dto.BaseDTO;
import app.ladderproject.crud.controller.BaseController;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import app.ladderproject.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import app.ladderproject.integration.service.ExcelTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/excel-template")
@RequiredArgsConstructor
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Excel-template", description = "سرویس مدیریت قالب های اکسل ")})
public class ExcelTemplateController extends BaseController<ExcelTemplateReqVM, ExcelTemplateResVM, Long> {

    private final ExcelTemplateService service;

    @GetMapping("/find/{processName}/{type}")
    public ResponseEntity<BaseDTO<ExcelTemplateResVM>> getByProcessNameAndType(@PathVariable String processName, @PathVariable String type) {
        return ResponseEntity.ok(service.findByProcessNameAndType(processName, type));
    }
}