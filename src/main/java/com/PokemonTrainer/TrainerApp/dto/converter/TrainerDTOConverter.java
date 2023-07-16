package com.PokemonTrainer.TrainerApp.dto.converter;

import com.PokemonTrainer.TrainerApp.dto.TrainerDTO;
import com.PokemonTrainer.TrainerApp.model.Trainer;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class TrainerDTOConverter {
    private final TrainerBagDTOConverter trainerConverter;

    public TrainerDTOConverter(TrainerBagDTOConverter trainerConverter, PokemonDTOConverter pokemonConverter) {
        this.trainerConverter = trainerConverter;
        this.pokemonConverter = pokemonConverter;
    }

    private final PokemonDTOConverter pokemonConverter;

    public TrainerDTO convert(Trainer trainer)
    {
        return new TrainerDTO(trainer.getId(),
                trainer.getUsername(),
                trainer.getEmail(),
                trainer.getPassword(),
                trainer.getConfirmPassword(),
                trainerConverter.convert(trainer.getBag()),
                trainer.getPokemonList().stream().map(pokemonConverter::convert).collect(Collectors.toList())); //Bunu anlamam 2 gün alır ama easy peasy
    }
}
