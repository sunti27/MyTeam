package pkgMain;

import pkgData.Player;

public class MainApp {
	
	public static void main(String[] args) {
		Player player;
		
		player = new Player(2, "Dragovic", "Defense");
		System.out.println("== " + player);
		
		player = new Player(4, "Hinteregger", "Defense");
		System.out.println("== " + player);
	}

}
