package com.nicico.cost.integration.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EXCEL_TEMPLATE", uniqueConstraints = {@UniqueConstraint(columnNames = {"PROCESS_NAME", "TYPE"})})
@Data
@RequiredArgsConstructor
public class ExcelTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PROCESS_NAME")
    private String processName;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DATA")
    private String data;

    @Column(name = "ROW_NUMBER")
    private boolean rowNumber;
}
