package com.diegoviana.gamelist.services;

import com.diegoviana.gamelist.dto.GameMinDTO;
import com.diegoviana.gamelist.entities.Game;
import com.diegoviana.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Component
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games
                    .stream()
                    .map(GameMinDTO::new)
                    .toList();
    }
}
