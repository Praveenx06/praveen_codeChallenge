package com.hexaware.cricket.teammanagementsystem.entity;
/*
 * Author : Praveen
 * Modified on : 11-Aug-2025
 * Description : Player entity class 
 * */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="players")
public class Player {
	@Id
	private int playerId;
	private String playerName;
	private int jerseyNumber;
	private String role;
	private int totalMatches;
	private String teamName;
	private String country;
	private String descrption;
}
