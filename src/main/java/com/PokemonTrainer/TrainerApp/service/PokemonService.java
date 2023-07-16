package com.PokemonTrainer.TrainerApp.service;

import com.PokemonTrainer.TrainerApp.dto.PokemonDTO;
import com.PokemonTrainer.TrainerApp.dto.converter.PokemonDTOConverter;
import com.PokemonTrainer.TrainerApp.dto.request.PokemonRequest;
import com.PokemonTrainer.TrainerApp.model.Pokemon;
import com.PokemonTrainer.TrainerApp.repository.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private final PokemonDTOConverter pokemonConverter;
    private final PokemonRepository pokemonRepo;

    public PokemonService(PokemonDTOConverter pokemonConverter, PokemonRepository pokemonRepo) {
        this.pokemonConverter = pokemonConverter;
        this.pokemonRepo = pokemonRepo;
    }

    public PokemonDTO createPokemon(PokemonRequest request)
    {
        Pokemon pokemon = pokemonRepo.findPokemonByName(request.getName());
        if(pokemon == null){
            pokemon = new Pokemon(request.getName(),
                    request.getType(),
                    request.getBaseHp(),
                    request.getBaseAttack(),
                    request.getBaseDefance(),
                    request.getBaseSpeed());
            return pokemonConverter.convert(pokemonRepo.save(pokemon));
        }
        return pokemonConverter.convert(pokemon);
    }
}
