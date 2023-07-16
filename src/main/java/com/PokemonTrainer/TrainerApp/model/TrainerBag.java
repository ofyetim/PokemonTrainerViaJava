package com.PokemonTrainer.TrainerApp.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document
@Data // Getter Setter Autogenerate with Lombok
@NoArgsConstructor //Empty Constructer
public class TrainerBag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //autoGenerate annotation

    private int id;
    private int standardPokeballCount;
    private int superPokeballCount;
    private int ultraPokeballCount;
    private int lowPotionCount;
    private int mediumPotionCount;
    private int highPotionCount;

    public TrainerBag(int standardPokeballCount, int superPokeballCount, int ultraPokeballCount, int lowPotionCount, int mediumPotionCount, int highPotionCount) {
        this.standardPokeballCount = standardPokeballCount;
        this.superPokeballCount = superPokeballCount;
        this.ultraPokeballCount = ultraPokeballCount;
        this.lowPotionCount = lowPotionCount;
        this.mediumPotionCount = mediumPotionCount;
        this.highPotionCount = highPotionCount;
    }
}

