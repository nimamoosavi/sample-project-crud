package com.nicico.cost.integration.domain.entity;

import com.nicico.cost.crud.domain.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
@Setter
@Getter
public class User extends BaseEntity<Long> {

    @Column(name = "USERNAME", length = 20, unique = true, nullable = false)
    String username;
    @Column(name = "PASSWORD", nullable = false)
    String password;
}
