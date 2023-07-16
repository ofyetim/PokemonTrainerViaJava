package com.PokemonTrainer.TrainerApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document
@Data // Getter Setter Autogenerate with Lombok
@NoArgsConstructor //Empty Constructer
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //autoGenerate annotation

    private int id;
    private String name;
    private String type;
    private int baseHp;
    private int baseAttack;
    private int baseDefance;
    private  int baseSpeed;

    public Pokemon(String name, String type, int baseHp, int baseAttack, int baseDefance, int baseSpeed) {
        this.name = name;
        this.type = type;
        this.baseHp = baseHp;
        this.baseAttack = baseAttack;
        this.baseDefance = baseDefance;
        this.baseSpeed = baseSpeed;
    }
}
