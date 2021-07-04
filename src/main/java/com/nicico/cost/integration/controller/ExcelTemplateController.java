package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import com.nicico.cost.integration.service.ExcelTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;

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

    @GetMapping("/find/{processName}/{type}/download")
    public ResponseEntity<InputStreamResource> getExcelByProcessNameAndType(@PathVariable String processName, @PathVariable String type) {

        ByteArrayInputStream byteArrayInputStream = service.modelDataToExcel(getByProcessNameAndType(processName, type).getBody());
        String filename = processName + "-" + type + ".xlsx";
        InputStreamResource file = new InputStreamResource(byteArrayInputStream);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .body(file);
    }
}