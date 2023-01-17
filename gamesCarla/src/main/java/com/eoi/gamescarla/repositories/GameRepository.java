package com.eoi.gamescarla.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eoi.gamescarla.entities.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long>{

}
