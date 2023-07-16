package com.PokemonTrainer.TrainerApp.dto;

import com.PokemonTrainer.TrainerApp.model.Pokemon;
import com.PokemonTrainer.TrainerApp.model.TrainerBag;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class TrainerDTO {

    private int id ;
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    private TrainerBagDTO bag;
    private List<PokemonDTO> pokemonList;

    public TrainerDTO(int id, String username, String email, String password, String confirmPassword, TrainerBagDTO bag, List<PokemonDTO> pokemonList) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.bag = bag;
        this.pokemonList = pokemonList;
    }
}
