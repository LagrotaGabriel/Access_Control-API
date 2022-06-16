package br.com.homeaccesscontrol.models.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_guestAccess", name = "guestAccess")
@Table(name = "TB_GUESTACCESS")
public class GuestAccessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "guestAccess")
    @Column(name = "guestAccess_id", nullable = false, unique = true, updatable = false, insertable = false)
    private Long id;

    @Column(name = "guestAccess_date", nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "id_entrance")
    private EntranceHallEntity entranceHallEntity;

    @ManyToOne
    @JoinColumn(name = "id_guest")
    private GuestEntity guest;

}
