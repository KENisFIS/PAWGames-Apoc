//*********************************************************************
// Reputation or Rep affects game play. Depending on what a player's
// rep is, that player will get different missions. Players can choose
// to be evil, neutral, or good.
//*********************************************************************

package us.pawgames.apoc;

import org.bukkit.entity.Player;

public class Reputation {
	
	//Get a player's current rep
	public double getPlayerRep(Player player) {
		
		return 1;
	}

	//Adjust player rep for PVP combat
	public void repAdjustForPvp() {
		
		//The loser of a pvp battle has no rep change, but the winner's 
		//rep is adjusted by (3 * loserRep)
		
	}
	
	
	//Adjust player rep for Missions
	public void repAdjustForMission(){
		
		//Upon completion of a mission, the player's rep will be adjusted
		//by the mission rep amount. If the mission is failed, then player
		//has a negative rep adjustment.
		
	}
	
}
