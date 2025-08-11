package com.hexaware.cricket.teammanagementsystem.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PlayerDto {
	@NotNull(message = "Player ID is required")
	 @Min(value = 1, message = "Player ID must be greater than 0")
	private int playerId;
	
	 @NotBlank(message = "Player name should not be empty")
	private String playerName;
	
	 @NotNull
	@Min(value = 1, message = "Jersey number must be at least 1")
	private int jerseyNumber;
	
	@NotBlank(message="Role should not be null")
	@Pattern(regexp="Batsman|Bowler|Allrounder|Wicketkeeper Batsman")
	private String role;

    @NotNull(message = "Total matches is required")
	@Min(value = 1, message = "Total matches must be at least 1")
	private int totalMatches;
	
	@NotBlank(message ="should not be null")
	private String teamName;

    @NotBlank(message = "Country should not be blank")
	private String country;
	
	@NotBlank(message="Description can't blank , write a proper description")
	private String descrption;
	
	public PlayerDto() {} 

	public PlayerDto( int playerId,  String playerName, int jerseyNumber, String role, int totalMatches, String teamName,
			String country, String descrption) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.descrption = descrption;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	@Override
	public String toString() {
		return "PlayerDto [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", descrption=" + descrption + "]";
	}
	
	
	
	

}
