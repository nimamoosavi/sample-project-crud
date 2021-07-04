package com.nicico.cost.integration.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

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

    @ElementCollection
    @MapKeyColumn(name = "NAME")
    @Column(name = "VALUE")
    @CollectionTable(name = "EXCEL_TEMPLATE_ATTRIBUTES", joinColumns = @JoinColumn(name = "EXCEL_TEMPLATE_ID"))
    private Map<String, String> attributes = new HashMap<>();
}