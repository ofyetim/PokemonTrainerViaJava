package com.PokemonTrainer.TrainerApp.dto.request;

import com.PokemonTrainer.TrainerApp.dto.PokemonDTO;
import com.PokemonTrainer.TrainerApp.dto.TrainerBagDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TrainerRequest {
    private  String username;
    private  String email;
    private  String password;
    private  String confirmPassword;
    private TrainerBagDTO bag;
}
