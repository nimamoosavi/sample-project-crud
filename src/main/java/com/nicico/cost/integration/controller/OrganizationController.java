package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.integration.domain.view.organization.OrganizationReqVM;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/organization")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "organization", description = "سرویس مدیریت امورات")})
@RequiredArgsConstructor
public class OrganizationController extends BaseController<Organization, OrganizationReqVM, OrganizationResVM, Long> {
}
