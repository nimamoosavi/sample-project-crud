package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.integration.domain.view.accmap.AccMapReqVM;
import com.nicico.cost.integration.domain.view.accmap.AccMapResVM;
import com.nicico.cost.integration.service.AccMapService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/acc-map")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Acc-Map", description = "سرویس مدیریت اطلاعات پایه")})
@RequiredArgsConstructor
public class AccMapController extends BaseController<AccMapReqVM, AccMapResVM, Long> {

    private final AccMapService accMapService;


}
