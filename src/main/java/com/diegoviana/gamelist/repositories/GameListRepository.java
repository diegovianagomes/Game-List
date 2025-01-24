package com.diegoviana.gamelist.repositories;

import com.diegoviana.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Integer> {
}
