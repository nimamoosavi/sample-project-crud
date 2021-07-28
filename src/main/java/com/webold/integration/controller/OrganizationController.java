package com.webold.integration.controller;

import com.webold.crud.controller.BaseController;
import com.webold.integration.domain.view.organization.OrganizationReqVM;
import com.webold.integration.domain.view.organization.OrganizationResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/organization")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "organization", description = "سرویس مدیریت سازمان ها")})
@RequiredArgsConstructor
public class OrganizationController extends BaseController<OrganizationReqVM, OrganizationResVM, Long> {
}
