package com.PokemonTrainer.TrainerApp.service;

import com.PokemonTrainer.TrainerApp.dto.PokemonDTO;
import com.PokemonTrainer.TrainerApp.dto.TrainerDTO;
import com.PokemonTrainer.TrainerApp.dto.converter.TrainerDTOConverter;
import com.PokemonTrainer.TrainerApp.dto.request.TrainerRequest;
import com.PokemonTrainer.TrainerApp.model.Pokemon;
import com.PokemonTrainer.TrainerApp.model.Trainer;
import com.PokemonTrainer.TrainerApp.model.TrainerBag;
import com.PokemonTrainer.TrainerApp.repository.TrainerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrainerService {
    private  final TrainerDTOConverter trainerConverter;
    private  final TrainerRepository trainerRepo;

    public TrainerService(TrainerDTOConverter trainerConverter, TrainerRepository trainerRepo) {
        this.trainerConverter = trainerConverter;
        this.trainerRepo = trainerRepo;
    }

    public TrainerDTO createTrainer(TrainerRequest request)
    {
        Trainer trainer = trainerRepo.findTrainerByUsername(request.getUsername());
        if(trainer == null)
        {
            trainer = new Trainer(request.getUsername(),
                    request.getEmail(),
                    request.getPassword(),
                    request.getConfirmPassword(),
                    new TrainerBag(request.getBag().getStandardPokeballCount(),
                            request.getBag().getSuperPokeballCount(),
                            request.getBag().getUltraPokeballCount(),
                            request.getBag().getLowPotionCount(),
                            request.getBag().getMediumPotionCount(),
                            request.getBag().getHighPotionCount()),
                    new ArrayList<Pokemon>());// BANA BU MODEL TİPİNDE BOŞ BİR POKEMON LİSTESİ VER AGAM

            return  trainerConverter.convert(trainerRepo.save(trainer));
        }
        return trainerConverter.convert(trainer); //Eğer böyle bir trainer varsa bana onu getiriver
    }

}
