package app.ladderproject.integration.controller;

import app.ladderproject.crud.controller.BaseController;
import com.webold.framework.domain.dto.BaseDTO;
import app.ladderproject.integration.domain.view.department.DepartmentReqVM;
import app.ladderproject.integration.domain.view.department.DepartmentResVM;
import app.ladderproject.integration.service.DepartmentService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/department")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Department", description = "سرویس مدیریت اطلاعات بخش ها")})
@RequiredArgsConstructor
public class DepartmentController extends BaseController<DepartmentReqVM, DepartmentResVM, Long> {

    private final DepartmentService departmentService;


    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping(value = "/findByDepartmentCode")
    public ResponseEntity<BaseDTO<DepartmentResVM>> findByDepartmentCode(@RequestParam Long code) {
        return ResponseEntity.ok(departmentService.findByDepartmentCode(code));
    }
}