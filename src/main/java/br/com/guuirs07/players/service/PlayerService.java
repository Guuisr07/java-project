package br.com.guuirs07.players.service;

import br.com.guuirs07.players.domain.PlayerEntity;
import br.com.guuirs07.players.exception.PlayerNotFoundException;
import br.com.guuirs07.players.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Transactional(readOnly = true)
    public List<PlayerEntity> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public PlayerEntity getPlayerById(Long id) {
        return playerRepository.findById(id).orElseThrow(() -> new PlayerNotFoundException("Player not found"));
    }

    @Transactional
    public void createPlayer(PlayerEntity playerEntity) {
        playerRepository.save(playerEntity);
    }

    @Transactional
    public void deletePlayerById(Long id) {
        if (!playerRepository.existsById(id)) {
            throw new PlayerNotFoundException("Player not found");
        }
        playerRepository.deleteById(id);
    }

}
