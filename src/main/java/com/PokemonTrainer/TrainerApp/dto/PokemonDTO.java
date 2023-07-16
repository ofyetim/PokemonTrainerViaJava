package com.PokemonTrainer.TrainerApp.dto;

import com.PokemonTrainer.TrainerApp.model.Trainer;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PokemonDTO {

    private int id;
    private String name;
    private String type;
    private int baseHp;
    private int baseAttack;
    private int baseDefance;
    private  int baseSpeed;

    public PokemonDTO(int id, String name, String type, int baseHp, int baseAttack, int baseDefance, int baseSpeed) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.baseHp = baseHp;
        this.baseAttack = baseAttack;
        this.baseDefance = baseDefance;
        this.baseSpeed = baseSpeed;
    }
}
