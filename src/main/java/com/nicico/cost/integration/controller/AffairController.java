package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.integration.domain.entity.Affair;
import com.nicico.cost.integration.domain.view.request.AffairReqVM;
import com.nicico.cost.integration.domain.view.response.AffairResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/rest/integration/v1/affair")
@Api(value = "Integration", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "Integration", description = "سرویس مدیریت اطلاعات")})
@RequiredArgsConstructor
public class AffairController extends BaseController<Affair, AffairReqVM, AffairResVM, Long> {
}
