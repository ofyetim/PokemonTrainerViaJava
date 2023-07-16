package com.PokemonTrainer.TrainerApp.dto.converter;

import com.PokemonTrainer.TrainerApp.dto.PokemonDTO;
import com.PokemonTrainer.TrainerApp.model.Pokemon;
import org.springframework.stereotype.Component;

@Component
public class PokemonDTOConverter {
    public PokemonDTO convert(Pokemon pokemon)
    {
        return new PokemonDTO(pokemon.getId(),
                pokemon.getName(),
                pokemon.getType(),
                pokemon.getBaseHp(),
                pokemon.getBaseAttack(),
                pokemon.getBaseDefance(),
                pokemon.getBaseSpeed());
    }
}
