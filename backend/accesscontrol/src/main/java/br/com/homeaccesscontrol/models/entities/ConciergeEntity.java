package br.com.homeaccesscontrol.models.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_concierge", name = "concierge")
@Table(name = "TB_CONCIERGE")
public class ConciergeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "concierge")
    @Column(name = "concierge_id", nullable = false, unique = true, updatable = false, insertable = false)
    private Long id;

    @Column(name = "concierge_nm", nullable = false)
    private String name;

    @Column(name = "concierge_cpf", nullable = false)
    private String cpf;

    @OneToOne(mappedBy = "concierge")
    private EntranceHall entranceHall;

}
