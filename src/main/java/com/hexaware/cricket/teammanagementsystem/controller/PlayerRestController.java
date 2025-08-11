package com.hexaware.cricket.teammanagementsystem.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricket.teammanagementsystem.dto.PlayerDto;
import com.hexaware.cricket.teammanagementsystem.dto.TeamMatchesDto;
import com.hexaware.cricket.teammanagementsystem.entity.Player;
import com.hexaware.cricket.teammanagementsystem.service.IPlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {
	
	@Autowired
	IPlayerService service;
	
	
	@PostMapping("/add")
    public Player addPlayer(@Valid @RequestBody PlayerDto dto) {
        return service.addPlayer(dto);
    }
	
	 @GetMapping("/getall")
	    public List<Player> getAllPlayers() {
	        return service.getAllPlayers();
	    }
	
	 @GetMapping("/getbyid/{playerId}")
	    public Player getById(@PathVariable int playerId) {
	        return service.getById(playerId);
	    }
	
	
	    @DeleteMapping("/deletebyid/{playerId}")
	    public String deleteByPlayerId(@PathVariable int playerId) {
	        return service.deleteByPlayerId(playerId);
	    }
	
	    @PutMapping("/update")
	    public Player updatePlayer(@Valid @RequestBody Player player) {
	        return service.updateplayer(player);
	    }


	    @GetMapping("/team-matches")
	    public List<TeamMatchesDto> getTeamMatches() {
	        return service.getTeamNameAndTotalMatches();
	    }
	
	

}
