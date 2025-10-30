package game.simple;

import java.util.Random;

public class GameMain {

	public static void main(String[] args) {
		Player player = new Player(100, 100, 100);
		Dragon dragon = new Dragon(30, 20, 50);
		Thief thief = new Thief(30, 20, 50);
		Mouse mouse = new mouse(30, 20, 50);
		
		Enemy[] enemys = {dragon, thief, mouse};
		
		Random rand = new Random();
		
		while(player.IsAlive()) {
			int val = rand.nextInt(enemys.length);
//			if(val == 0) {
//				dragon.Attack(player);
//			}
//			else if(val == 1){
//				thief.Attack(player);
//			}
//			else {
//			    mouse.Attack(player);
//		}
			
		enemys[val].Attack(player);
	}

}
