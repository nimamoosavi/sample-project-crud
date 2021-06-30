package com.nicico.cost.integration.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "PEOPLE_ACCESS_LIST", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"PEOPLE_ID", "ORGANIZATION_ID"})})
@Data
@RequiredArgsConstructor
public class PeopleAccessList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PEOPLE_ID", nullable = false)
    private People people;
    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID", nullable = false)
    private Organization organization;
    private boolean readAccess;
    private boolean writeAccess;
}
