package com.nicico.cost.integration.domain.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COST_TYPE")
@Setter
@Getter
public class AccMap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETAIL_TYPE_ID",updatable = false,insertable = false)
    private DetailType detailType;

    @Column(name = "DETAIL_TYPE_ID")
    private Long detailTypeId;

}
