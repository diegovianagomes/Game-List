package com.diegoviana.gamelist.repositories;

import com.diegoviana.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
