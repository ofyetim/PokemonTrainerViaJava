package com.PokemonTrainer.TrainerApp.controller;

import com.PokemonTrainer.TrainerApp.dto.PokemonDTO;
import com.PokemonTrainer.TrainerApp.dto.request.PokemonRequest;
import com.PokemonTrainer.TrainerApp.repository.PokemonRepository;
import com.PokemonTrainer.TrainerApp.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService, PokemonRepository pokemonRepo) {
        this.pokemonService = pokemonService;
    }
    @PostMapping("/createPokemon")
    @RequestMapping(value = "/createPokemon", method = RequestMethod.POST)
    public ResponseEntity<PokemonDTO> createPokemon(@RequestBody PokemonRequest request)
    {
        return ResponseEntity.ok(pokemonService.createPokemon(request));
    }
}
