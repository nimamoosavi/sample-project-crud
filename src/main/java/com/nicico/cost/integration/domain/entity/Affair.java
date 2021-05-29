package com.nicico.cost.integration.domain.entity;

import com.nicico.cost.crud.domain.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AFFAIR")
@Setter
@Getter
public class Affair extends BaseEntity<Long> {

    @Column(name = "NAME", unique = true, nullable = false, length = 50)
    private String name;
    @Column(name = "CODE", unique = true, nullable = false, length = 50)
    private String code;
}
