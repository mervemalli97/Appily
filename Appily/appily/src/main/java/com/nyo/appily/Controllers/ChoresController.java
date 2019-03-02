package com.nyo.appily.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nyo.appily.Models.ChoresEntity;
import com.nyo.appily.Repositories.ChoresRepo;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/chores")
@CrossOrigin(origins = "http://localhost:8080")
public class ChoresController {

        private ChoresRepo choresRepo;

        public ChoresController() {
        }
        @GetMapping("/chores")
        public List<ChoresEntity> getQuestions() {
            return choresRepo.findAll();
        }

        @PostMapping({"/chores"})
        public ChoresEntity createChore(@Valid @RequestBody ChoresEntity c) {
            return (ChoresEntity) this.choresRepo.save(c);
        }

        @PutMapping({"/chores/{choreId}"})
        public ChoresEntity updateChore(@PathVariable long choreId, @Valid @RequestBody ChoresEntity choreRequest) {
            return (ChoresEntity) this.choresRepo.findById(choreId).map((c) -> {
                c.setTitle(choreRequest.getTitle());
                c.setDescription(choreRequest.getDescription());
                return (ChoresEntity)this.choresRepo.save(c);
            }).orElseThrow(() -> {
                return new RuntimeException("Chore not found with id " + choreId);
            });
        }

        @DeleteMapping({"/chores/{choreId}"})
        public ResponseEntity<?> deleteChore(@PathVariable Long choreId) {
            return (ResponseEntity)this.choresRepo.findById(choreId).map((c) -> {
                this.choresRepo.delete(c);
                return ResponseEntity.ok().build();
            }).orElseThrow(() -> {
                return new RuntimeException("Chore not found with id " + choreId);
            });
        }
    }
