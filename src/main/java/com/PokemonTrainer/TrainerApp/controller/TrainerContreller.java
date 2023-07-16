package com.PokemonTrainer.TrainerApp.controller;

import com.PokemonTrainer.TrainerApp.dto.TrainerDTO;
import com.PokemonTrainer.TrainerApp.dto.request.TrainerRequest;
import com.PokemonTrainer.TrainerApp.service.TrainerService;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainer")
public class TrainerContreller {

    private final TrainerService trainerService;


    public TrainerContreller(TrainerService trainerService) {
        this.trainerService = trainerService;
    }
    @PostMapping("/createTrainer")
    @RequestMapping(value = "/createTrainer", method = RequestMethod.POST)
    public ResponseEntity<TrainerDTO> createTrainer(@RequestBody TrainerRequest request){
        return ResponseEntity.ok(trainerService.createTrainer(request));
    }
}
