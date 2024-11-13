package com.oidu.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oidu.dslist.dto.GameListDTO;
import com.oidu.dslist.entities.GameList;
import com.oidu.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	GameListRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	
	
}
