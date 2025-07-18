package br.com.guuirs07.players.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "Players")
@Data
@NoArgsConstructor
@AllArgsConstructor

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

    public int getAge() {
        if (birthDate == null) return 0;
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
