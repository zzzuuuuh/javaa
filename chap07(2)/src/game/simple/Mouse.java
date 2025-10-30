package game.simple;

import java.util.Random;

public class Mouse extends Enemy {

	public class Thief {
		int food;
		int reward;
		int winRatio;
		
		Thief(int food, int reward, int winRatio) {
			this.food = food;
			this.reward = reward;
			this.winRatio = winRatio;
		}
		
		void Attack(Player player) {
			Random rand = new Random();
			int val = rand.nextInt(100);
			
			if(val < 50) {
				System.out.println("Mouse Win!!");
				Damage(player);
			}
			else {
				System.out.println("Player Win!!");
			}
		}

	}
	void Damage(Player player) {
		player money -= money;
	}

	void Reward(Player player) {
		player.money += reward;
	}
		}

	}
	}


