package br.com.guuirs07.players.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Builder
public class PlayerRequestDTO {

    @NotBlank
    private String name;

    @NotNull
    private String position;

    @NotNull
    @DecimalMin(value = "0", inclusive = false)
    private BigDecimal marketValue;

    @NotBlank
    private String nationality;

    @NotNull
    @Past //Garante que o valor seja antorior ao momento atual (data no passado).
    private LocalDate birthDate;
}
