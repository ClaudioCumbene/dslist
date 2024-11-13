package com.oidu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oidu.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> { 

}