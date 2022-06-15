package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.models.enums.ResidentSituationEnum;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_resident", name = "resident")
@Table(name = "TB_RESIDENT")
public class ResidentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "resident")
    @Column(name = "resident_id", nullable = false, unique = true, insertable = false, updatable = false)
    private Integer id;

    @Column(name = "resident_nm", nullable = false, length = 70)
    private String name;

    @Column(name = "resident_cpf", nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(name = "resident_startDate", nullable = false, length = 10)
    private String homeStartDate;

    @Column(name = "resident_endDate", length = 10)
    private String homeEndDate;

    @Column(name = "resident_birthDate", nullable = false, length = 10)
    private String birthDate;

    @Column(name = "resident_rg", nullable = false, length = 12, unique = true)
    private String rg;

    @Enumerated(EnumType.STRING)
    @Column(name = "resident_situation")
    private ResidentSituationEnum residentSituation;

    @ManyToOne
    @JoinColumn(name = "id_residence")
    private ResidenceEntity residence;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "token_id", referencedColumnName = "id")
    private TokenEntity token;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ResidentAccessEntity> residentAccesses;

}
