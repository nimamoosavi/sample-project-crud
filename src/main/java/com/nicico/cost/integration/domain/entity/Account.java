package com.nicico.cost.integration.domain.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "acn_seq")
    @SequenceGenerator(name = "acn_seq", sequenceName = "SEQ_ACCOUNTS_ID", allocationSize = 1)
    @Column(name = "ACN_ID", precision = 10)
    private Long id;

    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACN_PARENT_ID",updatable = false,insertable = false)
    private Account parentAccount;

    @Column(name = "ACN_PARENT_ID")
    private Long parentId;

    @Column(name = "ACN_NUM", precision = 20)
    private Long accountNumber;

    @Column(name = "ACN_ACCOUNTNAME", nullable = false)
    private String accountName;


    @Column(name = "ACN_CODE")
    private String code;

    /**
     * if acnChild value was 0 , mean that the row was leaf in other side that was parent
     */
    @Column(name = "ACN_CHILDDIGITCOUNT")
    private Long acnChild;


}
