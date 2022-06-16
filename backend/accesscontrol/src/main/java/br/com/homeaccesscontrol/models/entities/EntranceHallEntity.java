package br.com.homeaccesscontrol.models.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_entrance", name = "entrance")
@Table(name = "TB_ENTRANCEHALL")
public class EntranceHallEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "entrance")
    @Column(name = "entrance_id", nullable = false, insertable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "entrance_nm", nullable = false, length = 30)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "concierge_id", referencedColumnName = "concierge_id")
    private ConciergeEntity concierge;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ResidentAccessEntity> residentAccesses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GuestAccessEntity> guestAccesses;

}
