package br.com.guuirs07.players.service;

import br.com.guuirs07.players.domain.PlayerEntity;
import br.com.guuirs07.players.domain.PlayerPosition;
import br.com.guuirs07.players.dto.PlayerRequestDTO;
import br.com.guuirs07.players.dto.PlayerResponseDTO;
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

    private PlayerEntity toEntity(PlayerRequestDTO dto) {
        PlayerEntity player = new PlayerEntity();
        player.setName(dto.getName());
        player.setBirthDate(dto.getBirthDate());
        player.setNationality(dto.getNationality());
        player.setMarketValue(dto.getMarketValue());
        player.setPosition(PlayerPosition.valueOf(dto.getPosition()));
        return player;
    }

    private PlayerResponseDTO toResponseDTO(PlayerEntity entity) {
        return PlayerResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .position(entity.getPosition().name())
                .marketValue(entity.getMarketValue())
                .nationality(entity.getNationality())
                .birthDate(entity.getBirthDate())
                .age(entity.getAge())
                .build();
    }

    @Transactional(readOnly = true)
    public List<PlayerResponseDTO> getAllPlayers() {
        return playerRepository.findAll().stream()
                .map(this::toResponseDTO)
                .toList();
    }

    @Transactional(readOnly = true)
    public PlayerResponseDTO getPlayerById(Long id) {
        PlayerEntity entity = playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Player not found"));
        return toResponseDTO(entity);
    }

    @Transactional
    public PlayerResponseDTO createPlayer(PlayerRequestDTO dto) {
        PlayerEntity entity = toEntity(dto);
        PlayerEntity saved = playerRepository.save(entity);
        return toResponseDTO(saved);
    }

    @Transactional
    public void deletePlayerById(Long id) {
        if (!playerRepository.existsById(id)) {
            throw new PlayerNotFoundException("Player not found");
        }
        playerRepository.deleteById(id);
    }

}
