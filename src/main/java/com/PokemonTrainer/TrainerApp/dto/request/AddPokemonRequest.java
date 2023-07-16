package com.PokemonTrainer.TrainerApp.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddPokemonRequest {
    private int pokemonId;
    private int trainerId;
}
