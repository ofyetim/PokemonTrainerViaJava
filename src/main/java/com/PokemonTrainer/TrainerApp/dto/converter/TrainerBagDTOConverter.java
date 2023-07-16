package com.PokemonTrainer.TrainerApp.dto.converter;

import com.PokemonTrainer.TrainerApp.dto.TrainerBagDTO;
import com.PokemonTrainer.TrainerApp.model.TrainerBag;
import org.springframework.stereotype.Component;

@Component
public class TrainerBagDTOConverter {
    public TrainerBagDTO convert(TrainerBag bag)
    {
        return new TrainerBagDTO(bag.getId(),
                bag.getStandardPokeballCount(),
                bag.getSuperPokeballCount(),
                bag.getUltraPokeballCount(),
                bag.getLowPotionCount(),
                bag.getMediumPotionCount(),
                bag.getHighPotionCount());
    }

}
