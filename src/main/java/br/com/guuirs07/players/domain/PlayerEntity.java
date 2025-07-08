package br.com.guuirs07.players.domain;

import br.com.guuirs07.players.dto.PlayerRequestDTO;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Entity
@Table(name = "Players")
@Data
@NoArgsConstructor
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 60)
    private String nationality;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 3)
    private PlayerPosition position;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal marketValue;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Builder
    protected PlayerEntity(@NonNull String name, @NonNull String nationality,
                        String position, BigDecimal marketValue,
                        LocalDate birthDate) {
        this.name = name;
        this.nationality = nationality;
        this.marketValue = marketValue;
        this.birthDate = birthDate;
        this.position = Optional.ofNullable(position)
                .map(PlayerPosition::fromString)
                .orElseThrow(() -> new IllegalArgumentException("Position não pode ser nulo"));
    }

    @Builder(builderClassName = "fromPlayerRequestDTO", builderMethodName = "fromPlayerRequestDTOBuilder")
    protected PlayerEntity(PlayerRequestDTO dto) {
        this.name = dto.getName();
        this.birthDate = dto.getBirthDate();
        this.nationality = dto.getNationality();
        this.position = PlayerPosition.valueOf(dto.getPosition());
        this.marketValue = dto.getMarketValue();
    }

    public int getAge() {
        if (birthDate == null) return 0;
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
