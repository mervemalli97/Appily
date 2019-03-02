package com.nyo.appily.Repositories;

import com.nyo.appily.Models.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepo extends JpaRepository<NotesEntity, Long> {
}
