package com.nicico.cost.integration.domain.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COST_TYPE")
@Setter
@Getter
public class CostType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @ManyToOne
    private CostType parent;
    @Column(name = "CODE",unique = true)
    private String code;
    @Column(name = "SORT")
    private Long sort;
}
