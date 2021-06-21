package com.nicico.cost.integration.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "TBL_DETAIL_TYPE_RELATION")
@Subselect("select * from detail_type_relation")
@IdClass(DetailTypeRelation.DetailTypeRelationId.class)
public class DetailTypeRelation {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_DETAIL_TYPE"))
    private Detail detail;

    @Column(name = "DET_ID", insertable = false, updatable = false)
    @Id
    private Long detailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_TYPE_DETAIL"))
    private DetailType detailType;

    @Column(name = "TYPE_ID", insertable = false, updatable = false)
    @Id
    private Long detailTypeId;

    @Data
    @AllArgsConstructor
    class DetailTypeRelationId implements Serializable {
        Integer detailId;
        Integer detailTypeId;
    }

}
