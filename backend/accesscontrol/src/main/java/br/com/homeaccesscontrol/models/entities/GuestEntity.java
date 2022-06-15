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
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_guest", name = "guest")
@Table(name = "TB_GUEST")
public class GuestEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "guest")
    @Column(name = "guest_id", unique = true, nullable = false, updatable = false, insertable = false)
    private Long id;

    @Column(name = "guest_nm")
    private String name;

    @Column(name = "guest_cpf", unique = true)
    private String cpf;

    @Column(name = "guest_residence", nullable = false)
    private ResidenceEntity residence;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GuestAccessEntity> accesses;

}
