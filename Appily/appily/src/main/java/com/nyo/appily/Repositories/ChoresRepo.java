package com.nyo.appily.Repositories;

import com.nyo.appily.Models.ChoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoresRepo extends JpaRepository<ChoresEntity, Long> {
}
