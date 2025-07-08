package br.com.guuirs07.players.dto;

import br.com.guuirs07.players.domain.PlayerEntity;
import lombok.Data;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Data
public class PlayerResponseDTO {
    private Long id;
    private String name;
    private String position;
    private BigDecimal marketValue;
    private String nationality;
    private LocalDate birthDate;
    private int age;

    public PlayerResponseDTO(@NonNull PlayerEntity entity) {

        this.id = Optional.ofNullable(entity.getId())
                .orElseThrow(() -> new IllegalArgumentException("Id não pode ser nulo."));

        this.name = entity.getName();
        this.birthDate = entity.getBirthDate();
        this.nationality = entity.getNationality();
        this.marketValue = entity.getMarketValue();
        this.age = entity.getAge();
        this.position = entity.getPosition().name();
    }
}
