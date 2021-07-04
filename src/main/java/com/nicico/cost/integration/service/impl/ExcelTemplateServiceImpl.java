package com.nicico.cost.integration.service.impl;

import com.nicico.cost.crud.service.impl.GeneralServiceImpl;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.integration.domain.entity.ExcelTemplate;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateReqVM;
import com.nicico.cost.integration.domain.view.exceltemplate.ExcelTemplateResVM;
import com.nicico.cost.integration.repository.exceltemplate.ExcelTemplateJdbcService;
import com.nicico.cost.integration.service.ExcelTemplateService;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExcelTemplateServiceImpl extends GeneralServiceImpl<ExcelTemplate, ExcelTemplateReqVM, ExcelTemplateResVM, Long> implements ExcelTemplateService {

    private final ExcelTemplateJdbcService service;

    @Override
    public BaseDTO<ExcelTemplateResVM> findByProcessNameAndType(String processName, String type) {
        ExcelTemplate excelTemplate = service.findByProcessNameAndType(processName, type);
        return generalMapper.mapBaseObjectToResponse(excelTemplate);
    }

    @Override
    public ByteArrayInputStream modelDataToExcel(BaseDTO<ExcelTemplateResVM> template) {

        try (
                Workbook workbook = new XSSFWorkbook();
                ByteArrayOutputStream out = new ByteArrayOutputStream()
        ) {
            Sheet sheet = workbook.createSheet();

            Row headerRow = sheet.createRow(0);

            Map<Integer, String> map = getExcelData(template.getData());
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                Cell cell = headerRow.createCell(entry.getKey());
                cell.setCellValue(entry.getValue());
            }

            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
        }
    }

    public Map<Integer, String> getExcelData(ExcelTemplateResVM excelTemplate) {
        Map<Integer, String> excelData = new HashMap<>();
        String[] dataLists = excelTemplate.getData().split(",");
        int index = 0;
        for (String dataList : dataLists) {
            if (excelTemplate.isRowNumber()) {
                excelData.put(index, "row Number");
                index += 1;
            }
            excelData.put(index, dataList);
            index += 1;
        }
        return excelData;
    }
}
