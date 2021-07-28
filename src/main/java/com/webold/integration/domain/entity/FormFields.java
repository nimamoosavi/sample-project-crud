package com.webold.integration.domain.entity;

import com.webold.integration.domain.enums.FiledType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "FORM_FIELDS")
@Setter
@Getter
public class FormFields {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "LABEL", nullable = false)
    private String label;

    @Column(name = "TYPES", nullable = false)
    @Enumerated(EnumType.STRING)
    private FiledType type;

    @Column(name = "MIN_LENGTH")
    private Integer minLength;

    @Column(name = "MAX_LENGTH")
    private Integer maxLength;

    @Column(name = "MIN_VALUE")
    private Double minValue;

    @Column(name = "MAX_VALUE")
    private Double maxValue;

    @Column(name = "API_VALIDATE")
    private String apiVal;

    @Column(name = "DATE_FORMAT_VALIDATE")
    private String dateFormatVal;

    @Column(name = "REQUIRED", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Boolean required = false;

    @Column(name = "UNIQUES", columnDefinition = "NUMBER(1) DEFAULT 0")
    private Boolean unique = false;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SORT_NUMBER")
    private Integer sortNumber;

    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COST_ID", updatable = false, insertable = false)
    private Cost cost;

    @Column(name = "COST_ID")
    private Long costId;


    @PrePersist
    @PreUpdate
    private void checkAndSetValue() {
        if (this.required == null)
            this.required = false;
        if (this.unique == null)
            this.unique = false;
    }
}
