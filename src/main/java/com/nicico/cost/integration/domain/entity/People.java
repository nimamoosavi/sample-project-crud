package com.nicico.cost.integration.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PEOPLE")
@Setter
@Getter
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "C_ID")
    private Long id;

    @Column(name = "C_BIRTH_CITY")
    private String birthCity;

    @Column(name = "C_FIRST_NAME")
    private String firstName;

    @Column(name = "C_LAST_NAME")
    private String lastName;

    @Column(name = "C_FATHER_NAME")
    private String fatherName;

    @Column(name = "C_GENDER")
    private String gender;

    @Column(name = "C_NATIONAL_CODE")
    private String nationalCode;
}
