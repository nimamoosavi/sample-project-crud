package app.ladderproject.integration.domain.entity;


import app.ladderproject.integration.domain.enums.CenterDetail;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COST", uniqueConstraints = {
        @UniqueConstraint(name = "COST-NAME", columnNames = {"name"}), @UniqueConstraint(name = "COST-CODE", columnNames = {"code"})})
@Setter
@Getter
public class Cost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "CODE", nullable = false)
    private String code;

    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACN_ID", updatable = false, insertable = false)
    private Account account;

    @Column(name = "ACN_ID", nullable = false)
    private Long accountId;


    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET1_ID", updatable = false, insertable = false)
    private Detail detail1;

    @Column(name = "DET1_ID")
    private Long det1Id;


    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET2_ID", updatable = false, insertable = false)
    private Detail detail2;

    @Column(name = "DET2_ID")
    private Long det2Id;


    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET3_ID", updatable = false, insertable = false)
    private Detail detail3;

    @Column(name = "DET3_ID")
    private Long det3Id;

    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET4_ID", updatable = false, insertable = false)
    private Detail detail4;

    @Column(name = "DET4_ID")
    private Long det4Id;

    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DET5_ID", updatable = false, insertable = false)
    private Detail detail5;

    @Column(name = "DET5_ID")
    private Long det5Id;

    @Column(name = "CENTER_DETAIL")
    @Enumerated(EnumType.STRING)
    private CenterDetail centerDetail;

    @OneToMany(mappedBy = "cost")
    private List<FormFields> fields;
}
