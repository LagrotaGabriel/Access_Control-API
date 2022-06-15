package br.com.homeaccesscontrol.models.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_residentAccess", name = "residentAccess")
@Table(name = "TB_RESIDENTACCESS")
public class ResidentAccessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "residentAccess")
    @Column(name = "residentAccess_id", nullable = false, unique = true, updatable = false, insertable = false)
    private Long id;

    @Column(name = "residentAccess_date", nullable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "id_entrance")
    private EntranceHall entranceHall;

    @ManyToOne
    @JoinColumn(name = "id_resident")
    private ResidentEntity resident;

}
