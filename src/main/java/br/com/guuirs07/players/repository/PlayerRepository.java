package br.com.guuirs07.players.repository;

import br.com.guuirs07.players.domain.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository  extends JpaRepository<PlayerEntity, Long> {
    Optional<PlayerEntity> findByName(String name);
}

