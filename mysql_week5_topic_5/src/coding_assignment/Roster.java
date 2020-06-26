package coding_assignment;

public class Roster {

	private int playerId;
	private String name;
	private String position;
	
	public Roster(int playerId, String name, String position) {
		this.setPlayerId(playerId);
		this.setName(name);
		this.setPosition(position);
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
