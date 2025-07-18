package br.com.guuirs07.players.domain;

import lombok.Getter;

@Getter
public enum PlayerPosition {
    GK("Goalkeeper"),
    CB("Center Back"),
    LB("Left Back"),
    RB("Right Back"),
    CM("Central Midfielder"),
    CDM("Defensive Midfielder"),
    CAM("Attacking Midfielder"),
    LW("Left Winger"),
    RW("Right Winger"),
    ST("Striker"),
    CF("Center Forward");

    private final String description;

    PlayerPosition(String description) {
        this.description = description;
    }


}
