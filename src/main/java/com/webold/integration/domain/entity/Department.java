package com.webold.integration.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
@Setter
@Getter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "DEP_ID")
    private Long id;

    @Column(name = "DEP_CODE")
    private Long departmentCode;

    @Column(name = "DEP_DEPARTMENTNAME")
    private String departmentName;

    @Column(name = "DEP_DEPARTMENTNAME_LATIN")
    private String departmentNameLatin;
}
