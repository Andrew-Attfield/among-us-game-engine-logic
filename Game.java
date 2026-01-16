public class Game {
	
	private Player[] player;
	private Map map;
	
	private Game() {
		this.player = new Player[10];
		this.map = Map.getInstance();
	}
	
	private Game(Player[] player, Map map) {
		this.player = new Player[player.length];
		for (int i = 0; i < player.length; i++) {
			
			Role copy = Role.getInstance(player[i].getRole());
			this.player[i] = Player.getInstance(player[i].getName(), copy);
			
		}
		
		this.map = Map.getInstance(map);
		
	}
	
	private Game(Game original) {
		this.player = new Player[original.player.length];
		for (int i = 0; i < original.player.length; i++) {
			
			Role copy = Role.getInstance(player[i].getRole());
			this.player[i] = Player.getInstance(original.player[i].getName(), copy);
			
		}
		
		this.map = Map.getInstance(original.map);
		
	}
	
	public static Game getInstance() {
		Game newGame = new Game();
		
		return newGame;
		
	}
	
	public static Game getInstance(Player[] player, Map map) {
		Game newGame = new Game(player, map);
		
		return newGame;
		
		
	}
	
	public static Game getInstance(Game original) {
		Game newGame = new Game(original);
		
		return newGame;
		
	}	
	
	public Player[] getPlayer() {
		return player;
	}
	
	public Map getMap() {
		return map;
		
	}
	
	public void setPlayer(Player[] newPlayer) {
		this.player = new Player[newPlayer.length];
		for (int i = 0; i < newPlayer.length; i++) {
			
			Role copy = Role.getInstance(newPlayer[i].getRole());
			this.player[i] = Player.getInstance(new String(newPlayer[i].getName()), copy);
			
		}
	}
		
	public void setMap(Map newMap) {
		this.map = Map.getInstance(newMap);
		
	}

	
} 

class Player {
	
	public String name;
	public Role role;
	
	private Player(String name, Role role) {
		this.name = name;
		this.role = role;
		
	}
	
	private Player(Player original) {		
		this.name = new String(original.name);
		this.role = Role.getInstance(original.role);
		
	}
	
	public static Player getInstance() {
		Player currentPlayer = new Player("noname", Role.getInstance('U'));
		
		return currentPlayer;
		
	}

	public static Player getInstance(String name, Role role) {
		Player currentPlayer = new Player(name, role);
		
		return currentPlayer;
		
	}

	public static Player getInstance(Player original) {
		Player currentPlayer = new Player(original);
		
		return currentPlayer;
		
	}

	public String getName() {
		return this.name;
	}
	
	public Role getRole() {
		return this.role;		
	}

	public void setName(String newName) {
		name = newName;
		
	}

	public void setRole(Role newRole) {
		role = newRole;
		
	}
	
} 

class Map{

	public String theSkeld;
	public String miraHq;
	public String polus;
	public String airShip;
		
	private Map(String theSkeld, String miraHq, String polus, String airShip) {
		this.theSkeld = theSkeld;
		this.miraHq = miraHq;
		this.polus = polus;
		this.airShip = airShip;
		
	}

	public static Map getInstance() {
		Map avaliableMaps = new Map("","","","");
		
		
		return avaliableMaps;
	}

	public static Map getInstance(String theSkeld, String miraHq, String polus, String airShip) {
		Map avaliableMaps = new Map(theSkeld, miraHq, polus, airShip);
		return avaliableMaps;
		
	}

	private Map(Map original) {
		this.theSkeld = new String(original.theSkeld);
		this.miraHq = new String(original.miraHq);
		this.polus = new String(original.polus);
		this.airShip = new String(original.airShip);
		
	}

	public static Map getInstance(Map original) {
		Map currentMap = new Map(original);
		
		return currentMap;
		
	}

} 

class Role{
	
	public char role;
	
	private Role(char role) {
		this.role = role;
			
	}
	
	public static Role getInstance() {
		Role newRole = new Role(' ');
		
		return newRole;
		
	}
	
	public static Role getInstance(char role) {
		Role newRole = new Role(role);
		
		return newRole;
		
	}
	
	private Role(Role original) {
		this.role = original.role;
		
	}
	
	public static Role getInstance(Role original) {
		Role newRole = new Role(original);
		
		return newRole;
	}

	public char getRole() {
		
		
		return role;
		
	}
		
	public void setRole(char newRole) {
		role = newRole;
		
	}
	
} 
