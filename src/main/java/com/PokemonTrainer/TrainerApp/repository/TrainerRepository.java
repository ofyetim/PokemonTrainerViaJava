package com.PokemonTrainer.TrainerApp.repository;

import com.PokemonTrainer.TrainerApp.model.Trainer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends MongoRepository<Trainer, Integer> {

    Trainer findTrainerByUsername(String username);
}
