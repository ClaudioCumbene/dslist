package com.oidu.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oidu.dslist.dto.GameMinDTO;
import com.oidu.dslist.entities.Game;
import com.oidu.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository gamerepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gamerepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	
	
}
