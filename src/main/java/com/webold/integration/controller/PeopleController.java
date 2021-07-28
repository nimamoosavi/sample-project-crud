package com.webold.integration.controller;

import com.webold.crud.controller.BaseController;
import com.webold.framework.domain.dto.BaseDTO;
import com.webold.integration.domain.view.people.PeopleReqVM;
import com.webold.integration.domain.view.people.PeopleResVM;
import com.webold.integration.service.PeopleService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/people")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "People", description = "سرویس مدیریت افراد")})
@RequiredArgsConstructor
public class PeopleController extends BaseController<PeopleReqVM, PeopleResVM, Long> {
    private final PeopleService peopleService;

    @ApiImplicitParams({@ApiImplicitParam(name = AUTHORIZATION, value = AUTHORIZATION, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CORRELATION_ID, value = CORRELATION_ID, required = true, dataType = "string", paramType = "header"),
            @ApiImplicitParam(name = CLIENT_VERSION, value = CLIENT_VERSION, required = true, dataType = "string", paramType = "header")})
    @GetMapping("/findBy/nationalCode")
    public ResponseEntity<BaseDTO<PeopleResVM>> findByNationalCode(@RequestParam String nationalCode) {
        return ResponseEntity.ok(peopleService.findByNationalCode(nationalCode));
    }

}
