package com.eoi.gamescarla.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eoi.gamescarla.entities.Game;
import com.eoi.gamescarla.repositories.GameRepository;

@Service
public class GameService {
@Autowired
private GameRepository gameRepository;
public List<Game> findAll(){
	return (List<Game>)gameRepository.findAll();
}

public Game findById(long id)
{
	return gameRepository.findById(id).orElse(null);
}
public Game insert(Game game) { // Servicio que inserta una categoria
    return gameRepository.save(game);
}
public Game update(long id, Game game) { // Servicio que actualiza una categoria
    game.setId(id);
    return gameRepository.save(game);
}
public void delete(long id) {// Servicio que borra una categoría
    gameRepository.deleteById(id);
}
}
