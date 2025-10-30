package game.simple;

public class Dragon extends Enemy {

	public static void main(String[] args) {
		int power;
		int reward;
		int winRatio;
		
		Dragon(int power, int reward, int winRatio) {
			this.power = power;
			this.reward = reward;
			this.winRatio = winRatio;
		}
		
		void Attack(Player player) {
			Random rand = new Random();
			int val = rand.nextInt(100);
			
			if(val < 50) {
				System.out.println("Dragon Win!!");
				Damage(player);
			}
			else {
				System.out.println("Player Win!!");
			}
		}

	}
	
	void Damage(Player player) {
		player health -= power;
	}
	
	void Reward(Player player) {
		player.health += reward;
	}
 
}
