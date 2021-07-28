package com.webold.integration.domain.view.peopleaccesslist;

import lombok.Data;

@Data
public class PeopleAccessListResVM {

    private Long id;
    private Long peopleId;
    private Long organizationId;
    private boolean readAccess;
    private boolean writeAccess;
}
