package br.com.homeaccesscontrol.models.entities;

import br.com.homeaccesscontrol.models.enums.TokenStatusEnum;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@SequenceGenerator(allocationSize = 1, sequenceName = "sq_token", name = "token")
@Table(name = "TB_TOKEN")
public class TokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "token")
    @Column(name = "token_id", unique = true, nullable = false, updatable = false, insertable = false)
    private Long id;

    @Column(name = "token_validateDate", nullable = false)
    private String validateDate;

    @Column(name = "token_key", nullable = false)
    private Long key;

    @Enumerated(EnumType.STRING)
    @Column(name = "token_status", nullable = false)
    private TokenStatusEnum status;

    @OneToOne(mappedBy = "token")
    private ResidentEntity resident;
}
