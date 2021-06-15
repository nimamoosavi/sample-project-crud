package com.nicico.cost.integration.controller;

import com.nicico.cost.crud.controller.BaseController;
import com.nicico.cost.framework.anotations.Unauthorized;
import com.nicico.cost.framework.domain.dto.BaseDTO;
import com.nicico.cost.framework.enums.authorize.HttpRequestType;
import com.nicico.cost.integration.domain.entity.Organization;
import com.nicico.cost.integration.domain.view.organization.OrganizationReqVM;
import com.nicico.cost.integration.domain.view.organization.OrganizationResVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/integration/v1/organization")
@Api(value = "Cost-Type", protocols = "HTTP")
@SwaggerDefinition(tags = {@Tag(name = "organization", description = "سرویس مدیریت امورات")})
@Unauthorized(types = {HttpRequestType.POST, HttpRequestType.DELETE, HttpRequestType.PUT})
@RequiredArgsConstructor
public class OrganizationController extends BaseController<Organization, OrganizationReqVM, OrganizationResVM, Long> {
    @Override
    public ResponseEntity<BaseDTO<OrganizationResVM>> create(OrganizationReqVM organizationReqVM) {
        return super.create(organizationReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<OrganizationResVM>> update(OrganizationReqVM organizationReqVM) {
        return super.update(organizationReqVM);
    }

    @Override
    public ResponseEntity<BaseDTO<Boolean>> deleteById(Long id) {
        return super.deleteById(id);
    }
}
