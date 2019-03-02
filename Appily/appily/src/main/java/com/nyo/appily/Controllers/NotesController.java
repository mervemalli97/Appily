package com.nyo.appily.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nyo.appily.Models.NotesEntity;
import com.nyo.appily.Repositories.NotesRepo;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/notes")
@CrossOrigin(origins = "http://localhost:8080")
public class NotesController {

    private NotesRepo notesRepo;

    public NotesController() {
    }

    @PostMapping({"/notes"})
    public NotesEntity createNote(@Valid @RequestBody NotesEntity n) {
        return (NotesEntity) this.notesRepo.save(n);
    }

    @PutMapping({"/notes/{noteId}"})
    public NotesEntity updateNote(@PathVariable long noteId, @Valid @RequestBody NotesEntity noteRequest) {
        return (NotesEntity) this.notesRepo.findById(noteId).map((n) -> {
            n.setTitle(noteRequest.getTitle());
            n.setText(noteRequest.getText());
            return (NotesEntity)this.notesRepo.save(n);
        }).orElseThrow(() -> {
            return new RuntimeException("Note not found with id " + noteId);
        });
    }

    @DeleteMapping({"/notes/{noteId}"})
    public ResponseEntity<?> deleteNote(@PathVariable Long noteId) {
        return (ResponseEntity)this.notesRepo.findById(noteId).map((n) -> {
            this.notesRepo.delete(n);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> {
            return new RuntimeException("Note not found with id " + noteId);
        });
    }
}