package br.com.guuirs07.players.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Players")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;

}
