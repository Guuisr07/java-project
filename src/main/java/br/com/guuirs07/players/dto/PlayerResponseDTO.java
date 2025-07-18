package br.com.guuirs07.players.dto;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class PlayerResponseDTO {
    private final Long id;
    private final String name;
    private final String position;
    private final BigDecimal marketValue;
    private final String nationality;
    private final LocalDate birthDate;
    private final int age;

    private PlayerResponseDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.position = builder.position;
        this.marketValue = builder.marketValue;
        this.nationality = builder.nationality;
        this.birthDate = builder.birthDate;
        this.age = builder.age;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String position;
        private BigDecimal marketValue;
        private String nationality;
        private LocalDate birthDate;
        private int age;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder marketValue(BigDecimal marketValue) {
            this.marketValue = marketValue;
            return this;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public PlayerResponseDTO build() {
            return new PlayerResponseDTO(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}