package com.nicico.cost.integration.domain.view.account;

import lombok.Data;

@Data
public class AccountResVM {

    private Long id;

    private Long parentId;

    private Long accountNumber;

    private String accountName;


    private String code;


    private Long acnChild;
}
