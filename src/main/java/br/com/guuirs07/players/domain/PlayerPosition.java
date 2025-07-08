package br.com.guuirs07.players.domain;

import lombok.Getter;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;

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

    public static PlayerPosition fromString(@NonNull String description) {
        return PlayerPosition.valueOf(description.toUpperCase());
    }
}
