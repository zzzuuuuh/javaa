package car.racing;

public class car {
	Tire tire;
	void Run() {
		tire.Usetire();
	}
	boolean CheckTire() {
		if(tire == null) return false;
		return tire.IsAbailable();
		
	}
	void ChangeTire(Tire tire) {
		this.tire = tire;
		System.out.println("Change tire!!");
	}

}
