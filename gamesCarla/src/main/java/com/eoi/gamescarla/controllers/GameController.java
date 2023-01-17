package com.eoi.gamescarla.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eoi.gamescarla.entities.Game;
import com.eoi.gamescarla.services.GameService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/games")
public class GameController { @Autowired
	private GameService gameService;


@GetMapping()
public List<Game> list(){
	return gameService.findAll();
}
@GetMapping("/{id}") // Get por Id
public Game findById(@PathVariable long id)
{
	return gameService.findById(id);
}
@PostMapping() // Post por id
public Game insert(@RequestBody Game game) {
	return gameService.insert(game);
}
@PutMapping("/{id}")
public Game update(@PathVariable int id,@RequestBody Game game) {
	return gameService.update(id, game);
}
@DeleteMapping("/{id}")
public void delete(@PathVariable int id) {
	gameService.delete(id);

}
}
