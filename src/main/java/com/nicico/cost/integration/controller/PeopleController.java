package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.authorize.HttpRequestType;
import com.nicico.cost.integration.domain.entity.People;
import com.nicico.cost.integration.domain.view.people.PeopleReqVM;
import com.nicico.cost.integration.domain.view.people.PeopleResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/people")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "People", description = "سرویس مدیریت افراد")})
@Unauthorized(types = {HttpRequestType.POST, HttpRequestType.DELETE, HttpRequestType.PUT})
@RequiredArgsConstructor
public class PeopleController extends BaseController<People, PeopleReqVM, PeopleResVM,Long> {

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
