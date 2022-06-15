package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.models.enums.BlockEnum;
import br.com.homeaccesscontrol.models.enums.ResidenceSituationEnum;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_residence", name = "residence")
@Table(name = "TB_RESIDENCE")
public class ResidenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "residence")
    @Column(name = "residence_id", nullable = false, updatable = false, insertable = false, unique = true)
    private Long id;

    @Column(name = "residence_floor")
    private Integer floor;

    @Column(name = "residence_number", unique = true, nullable = false)
    private Integer number;

    @Enumerated(EnumType.STRING)
    @Column(name = "residence_block")
    private BlockEnum block;

    @Enumerated(EnumType.STRING)
    @Column(name = "residence_situation")
    private ResidenceSituationEnum residenceSituation;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ResidentEntity> residents;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GuestEntity> guests;

}
