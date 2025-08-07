CREATE TABLE players (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    nationality VARCHAR(60) NOT NULL,
    position VARCHAR(3) NOT NULL,
    market_value NUMERIC(15,2) NOT NULL,
    birth_date DATE NOT NULL
);