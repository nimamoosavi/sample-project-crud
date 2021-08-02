package app.ladderproject.integration.service;

import app.ladderproject.crud.service.GeneralService;
import app.ladderproject.integration.domain.view.organization.OrganizationReqVM;
import app.ladderproject.integration.domain.view.organization.OrganizationResVM;

public interface OrganizationService extends GeneralService<OrganizationReqVM, OrganizationResVM, Long> {
}
