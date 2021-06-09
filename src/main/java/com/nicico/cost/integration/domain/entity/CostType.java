package com.nicico.cost.integration.domain.entity;

import com.nicico.cost.framework.packages.jdbc.base.BaseObject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "COST_TYPE")
@Setter
@Getter
public class CostType extends BaseObject<Long> {

    @Column(name = "NAME", unique = true, nullable = false, length = 30)
    private String name;

    @Column(name = "CODE", unique = true, nullable = false, length = 10)
    private String code;

    @Column(name = "SORT", unique = true, nullable = false, length = 10)
    private Long sort;

}
