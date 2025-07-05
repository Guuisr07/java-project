package br.com.guuirs07.players.controller;

import br.com.guuirs07.players.domain.PlayerEntity;
import br.com.guuirs07.players.service.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
@Tag(name = "Jogadores", description = "API dos jogadores do Corinthians")
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping
    @Operation(summary = "Listar jogadores", description = "Retorna todos os jogadores do Corinthians")
    public ResponseEntity<List<PlayerEntity>> getAllPlayers() {
        List<PlayerEntity> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar jogador por ID")
    public ResponseEntity<PlayerEntity> getPlayerById(@PathVariable Long id) {
        PlayerEntity player = playerService.getPlayerById(id);
        return ResponseEntity.ok(player);
    }

    @PostMapping
    @Operation(summary = "Adicionar novo jogador")
    public ResponseEntity<Void> addPlayer (@RequestBody PlayerEntity playerEntity) {
        playerService.createPlayer(playerEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remover jogador por ID")
    public ResponseEntity<Void> deletePlayerById(@PathVariable Long id) {
        playerService.deletePlayerById(id);
        return  ResponseEntity.noContent().build();
    }

}
