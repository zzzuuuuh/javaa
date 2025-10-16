package sec01.exam01;

public class Truck extends Car{
	int speed;
	int load;
	
	Truck(int speed, int load) {
		super(speed);
		//this.speed = speed;
		this.load = load;
	}
	
	void ShowSpeed(int speed) {
		System.out.println("Truck speed; : " + speed);
	}
	
	 
	}

