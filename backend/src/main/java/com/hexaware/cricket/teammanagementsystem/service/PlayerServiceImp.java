package com.hexaware.cricket.teammanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricket.teammanagementsystem.dto.PlayerDto;
import com.hexaware.cricket.teammanagementsystem.dto.TeamMatchesDto;
import com.hexaware.cricket.teammanagementsystem.entity.Player;
import com.hexaware.cricket.teammanagementsystem.exception.PlayerNotFoundException;
import com.hexaware.cricket.teammanagementsystem.exception.TeammatchesNotFoundException;
import com.hexaware.cricket.teammanagementsystem.repository.PlayerRepository;
@Service
public class PlayerServiceImp implements IPlayerService {
@Autowired
	PlayerRepository repo;
	
	@Override
	public Player addPlayer(PlayerDto dto) {
		Player player = new Player();
		player.setCountry(dto.getCountry());
		player.setDescrption(dto.getDescrption());
		player.setJerseyNumber(dto.getJerseyNumber());
		player.setPlayerId(dto.getPlayerId());
		player.setPlayerName(dto.getPlayerName());
		player.setRole(dto.getRole());
		player.setTeamName(dto.getTeamName());
		player.setTotalMatches(dto.getTotalMatches());
		return repo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		
		return repo.findAll();
	}

	@Override
	public String deleteByPlayerId(int playerId) {
		repo.deleteById(playerId);
		return "record deleted successfully";
	}

	@Override
	public Player updateplayer(Player player) {
		
		return repo.save(player);
	}

	

	@Override
	public Player getById(int PlayerId) throws PlayerNotFoundException{
	
		return repo.findById(PlayerId).orElseThrow(() -> new PlayerNotFoundException("player " + PlayerId + " not found"));
	}
	
	  @Override
	    public List<TeamMatchesDto> getTeamNameAndTotalMatches() {
	        List<Object[]> rawData = repo.findTeamNameAndTotalmatches();
	        if (rawData.isEmpty()) {
	            throw new TeammatchesNotFoundException("No team name and match data found.");
	        }

	        List<TeamMatchesDto> result = new ArrayList<>();
	        for (Object[] obj : rawData) {
	            String teamName = (String) obj[0];
	            int totalMatches = (int) obj[1];
	            result.add(new TeamMatchesDto(teamName, totalMatches));
	        }
	        return result;
	    }
}
	