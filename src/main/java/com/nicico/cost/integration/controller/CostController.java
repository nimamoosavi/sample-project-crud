package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.integration.domain.view.cost.CostReqVM;
import com.nicico.cost.integration.domain.view.cost.CostResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/cost")
@Api(value = "cost", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "cost", description = "سرویس مدیریت ثبت هزینه")})
public class CostController extends BaseController<CostReqVM, CostResVM, Long> {
}
