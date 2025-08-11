package com.hexaware.cricket.teammanagementsystem.service;

import java.util.List;

import com.hexaware.cricket.teammanagementsystem.dto.PlayerDto;
import com.hexaware.cricket.teammanagementsystem.entity.Player;
import com.hexaware.cricket.teammanagementsystem.exception.PlayerNotFoundException;

public interface IPlayerService {
	public Player addPlayer(PlayerDto dto);
	public List<Player> getAllPlayers();
	public Player getById(int playerId) throws PlayerNotFoundException ;
	public String deleteByPlayerId(int playerId) ;
	public Player updateplayer(Player player);
	public int updatePlayerById(String playerName ,int playerId) ;

}
