package car.racing;

public class Drytire extends Tire {
	Drytire(int capacity, int consume) {
		
	}
	boolean IsAbailable() {
		if(Env.isRain) return false;
		return capacity - consume > 0;
	}

}
