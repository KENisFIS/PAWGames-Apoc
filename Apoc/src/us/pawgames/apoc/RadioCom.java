//********************************************************************
//Q: What data is going to come through the RadioCom?
//A:
//
//Q: Does the player have to hold the RADIO_ITEM in order stay in a
//		channel?
//A: 
//*******************************************************************
//Option A: Have a list of online players store persistent data on
//          which channel the player is connected to.  Only those
//			channels with connected players will convey messages.
//
//Option B: Every channel conveys messages at all times, and players
//			join those channels already in progress.
//********************************************************************
// - Players can only communicate on the channel they're connected to
// - Players can only connect to one channel at a time
// - Players must have the RADIO_ITEM(to be determined) in their
//		inventory.
// - Change radio com channels through a GUI(chestcommands plugin)
//********************************************************************

package us.pawgames.apoc;

public class RadioCom {
	
}
