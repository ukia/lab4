package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;

	// Change this from ArrayList to HashMap.
	private HashMap<UUID, Player> hmPlayer = new HashMap<UUID, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		// TODO: Lab #4 Add a player to the table (should be pretty easy)
		hmPlayer.put(p.getPlayerID(), p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		// TODO: Lab #4 Remove a player from the table
		hmPlayer.remove(p.getPlayerID());
		return this;
	}

	public HashMap<UUID, Player> getHmPlayer() {

		return hmPlayer;
    }
}