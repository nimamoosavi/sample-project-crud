package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.authorize.HttpRequestType;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import com.nicico.cost.integration.service.PeopleService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.nicico.cost.framework.config.general.GeneralStatic.*;

@RestController
@RequestMapping(value = "/rest/integration/v1/people")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "People", description = "سرویس مدیریت افراد")})
@Unauthorized(types = {HttpRequestType.POST, HttpRequestType.DELETE, HttpRequestType.PUT})
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

    @Override
    public ResponseEntity<BaseDTO<PeopleResVM>> create(PeopleReqVM peopleReqVM) {
        return super.create(peopleReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<PeopleResVM>> update(PeopleReqVM peopleReqVM) {
        return super.update(peopleReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<Boolean>> deleteById(Long id) {
        return super.deleteById(id);
    }

}
