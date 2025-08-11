package com.hexaware.cricket.teammanagementsystem.repository;
/*
 * @Author : Praveen  
 * Modified On : 11-Aug-2025
 * Description : PlayerRepository 
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricket.teammanagementsystem.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	@Modifying
	@Query("update Player p set p.playerName = ?1 where p.playerId = ?2")
	public int updatePlayerById(String playerName ,int playerId);
	

}
