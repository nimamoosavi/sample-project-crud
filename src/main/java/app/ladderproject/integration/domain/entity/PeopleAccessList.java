package app.ladderproject.integration.domain.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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

    @Setter(AccessLevel.NONE)
    @ManyToOne
    @JoinColumn(name = "PEOPLE_ID", nullable = false, insertable = false, updatable = false)
    private People people;

    @Column(name = "PEOPLE_ID")
    private Long peopleId;

    @Setter(AccessLevel.NONE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZATION_ID", nullable = false, updatable = false, insertable = false)
    private Organization organization;

    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    private boolean readAccess;
    private boolean writeAccess;
}
