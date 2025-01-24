package com.diegoviana.gamelist.controllers;

import com.diegoviana.gamelist.dto.GameDTO;
import com.diegoviana.gamelist.dto.GameMinDTO;
import com.diegoviana.gamelist.entities.Game;
import com.diegoviana.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO game = gameService.findById(id);
        return game;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> game = gameService.findAll();
        return game;
    }
}
