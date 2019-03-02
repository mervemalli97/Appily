package com.nyo.appily.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nyo.appily.Models.UsersEntity;
import com.nyo.appily.Repositories.UsersRepo;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins = "http://localhost:8080")
public class UsersController {

    private UsersRepo userRepo;

    public UsersController() {
    }

    @PostMapping({"/users"})
    public UsersEntity createUser(@Valid @RequestBody UsersEntity n) {
        return (UsersEntity) this.userRepo.save(n);
    }

    @PutMapping({"/users/{userId}"})
    public UsersEntity updateUser(@PathVariable long userId, @Valid @RequestBody UsersEntity userRequest) {
        return (UsersEntity) this.userRepo.findById(userId).map((u) -> {
            u.setUsrName(userRequest.getUsrName());
            u.setUsrSurname(userRequest.getUsrSurname());
            return (UsersEntity)this.userRepo.save(u);
        }).orElseThrow(() -> {
            return new RuntimeException("User not found with id " + userId);
        });
    }

    @DeleteMapping({"/users/{userId}"})
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        return (ResponseEntity)this.userRepo.findById(userId).map((u) -> {
            this.userRepo.delete(u);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> {
            return new RuntimeException("User not found with id " + userId);
        });
    }
}