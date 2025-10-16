package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		Car car;
		Truck truck = new Truck(80, 200);
		
		
		car = truck;
		truck.ShowSpeed();
		car.ShowSpeed();
		
		System.out.println("car speed is" + car.speed);
		System.out.println("truck speed is" + truck.speed);
	}

}
