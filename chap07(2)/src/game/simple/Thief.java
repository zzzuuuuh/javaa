package game.simple;

import java.util.Random;

public class Thief extends Enemy{

	int power;
	int reward;
	int winRatio;
	
	Thief(int power, int reward, int winRatio) {
		this.power = power;
		this.reward = reward;
		this.winRatio = winRatio;
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val < 50) {
			System.out.println("Thief Win!!");
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
