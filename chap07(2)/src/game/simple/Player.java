package game.simple;

public class Player {

	public static void main(String[] args) {
		int health;
		int money;
		int food;
		
		Player(int health, int money, int food) {
			this.health = health;
			this.money = money;
			this.food = food;
		}
		
		boolean IsAlive()
		{
			if(health > 0 && money > 0 && food > 0)
				return true;
			else
				return false;
		}

	}

}
