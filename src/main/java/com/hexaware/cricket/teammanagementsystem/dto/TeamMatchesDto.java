package com.hexaware.cricket.teammanagementsystem.dto;


public class TeamMatchesDto {
    private String teamName;
    private int totalMatches;

    public TeamMatchesDto(String teamName, int totalMatches) {
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTotalMatches() {
        return totalMatches;
    }
}



