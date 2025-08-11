package com.hexaware.cricket.teammanagementsystem.service;

import java.util.List; 

import com.hexaware.cricket.teammanagementsystem.dto.PlayerDto;
import com.hexaware.cricket.teammanagementsystem.dto.TeamMatchesDto;

import com.hexaware.cricket.teammanagementsystem.entity.Player;

public interface IPlayerService {
	public Player addPlayer(PlayerDto dto);
	public List<Player> getAllPlayers();
	public Player getById(int playerId) ;
	public String deleteByPlayerId(int playerId) ;
	public Player updateplayer(Player player);
	 List<TeamMatchesDto> getTeamNameAndTotalMatches();
		
}
