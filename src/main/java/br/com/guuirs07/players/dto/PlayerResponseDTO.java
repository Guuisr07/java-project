package br.com.guuirs07.players.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PlayerResponseDTO {
    private Long id;
    private String name;
    private String position;
    private BigDecimal marketValue;
    private String nationality;
    private LocalDate birthDate;
    private int age;
}
