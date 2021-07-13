package com.nicico.cost.integration.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "DETAIL_TYPE")
public class DetailType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "type_seq")
    @SequenceGenerator(name = "type_seq", sequenceName = "SEQ_TYPE_ID", allocationSize = 1)
    @Column(name = "TYPE_ID", precision = 10)
    private Long id;

    @Column(name = "DET_TYPE_CODE", nullable = false)
    private String code;

    @Column(name = "DET_TYPE_NAME_FA", nullable = false, length = 100)
    private String nameFA;

    @Column(name = "DET_TYPE_NAME_EN", nullable = false)
    private String nameEN;
}
