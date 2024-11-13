package com.oidu.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oidu.dslist.dto.GameDTO;
import com.oidu.dslist.dto.GameMinDTO;
import com.oidu.dslist.entities.Game;
import com.oidu.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	
	
}
