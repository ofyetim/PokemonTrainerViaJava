package com.PokemonTrainer.TrainerApp.dto;

import com.PokemonTrainer.TrainerApp.model.Trainer;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class TrainerBagDTO {
    private int id;
    private int standardPokeballCount;
    private int superPokeballCount;
    private int ultraPokeballCount;
    private int lowPotionCount;
    private int mediumPotionCount;
    private int highPotionCount;

    private Trainer trainer;

    public TrainerBagDTO(int id, int standardPokeballCount, int superPokeballCount, int ultraPokeballCount,
                         int lowPotionCount, int mediumPotionCount, int highPotionCount) {
        this.id = id;
        this.standardPokeballCount = standardPokeballCount;
        this.superPokeballCount = superPokeballCount;
        this.ultraPokeballCount = ultraPokeballCount;
        this.lowPotionCount = lowPotionCount;
        this.mediumPotionCount = mediumPotionCount;
        this.highPotionCount = highPotionCount;
    }
}

