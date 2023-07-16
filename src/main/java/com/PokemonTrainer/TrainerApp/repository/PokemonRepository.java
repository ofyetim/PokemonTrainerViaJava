package com.PokemonTrainer.TrainerApp.repository;

import com.PokemonTrainer.TrainerApp.model.Pokemon;
import com.PokemonTrainer.TrainerApp.model.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, Integer> {
    Pokemon findPokemonById(Integer id);
    Pokemon findPokemonByName(String name);
}
