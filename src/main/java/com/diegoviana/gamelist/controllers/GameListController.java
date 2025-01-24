package com.diegoviana.gamelist.controllers;

import com.diegoviana.gamelist.dto.GameDTO;
import com.diegoviana.gamelist.dto.GameListDTO;
import com.diegoviana.gamelist.dto.GameMinDTO;
import com.diegoviana.gamelist.projections.GameMinProjection;
import com.diegoviana.gamelist.services.GameListService;
import com.diegoviana.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> game = gameListService.findAll();
        return game;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> game = gameService.findByList(listId);
        return game;
    }
}
