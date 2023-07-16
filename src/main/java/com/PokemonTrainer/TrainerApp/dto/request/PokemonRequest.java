package com.PokemonTrainer.TrainerApp.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PokemonRequest
{
    private String name;
    private String type;
    private int baseHp;
    private int baseAttack;
    private int baseDefance;
    private  int baseSpeed;
}
