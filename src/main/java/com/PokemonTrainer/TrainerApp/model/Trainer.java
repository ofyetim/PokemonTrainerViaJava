package com.PokemonTrainer.TrainerApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Document
@Data // Getter Setter Autogenerate with Lombok
@NoArgsConstructor //Empty Constructer
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //autoGenerate annotation

    private int id; //aga buna bakacağız UUID tipinde olacak burası
    private String username;
    private String email;
    private String password;
    private String confirmPassword;

    private TrainerBag bag ;
    private List<Pokemon> pokemonList;

    public Trainer(String username, String email, String password, String confirmPassword, TrainerBag bag, List<Pokemon> pokemonList) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.bag = bag;
        this.pokemonList = pokemonList;
    }
}
