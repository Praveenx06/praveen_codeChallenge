package com.hexaware.cricket.teammanagementsystem.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricket.teammanagementsystem.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	
	
	@Query("SELECT p.teamName , p.totalMatches  FROM Player p")
	List<Object[]> findTeamNameAndTotalmatches();
}
