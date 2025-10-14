package sec01.exam01;

public class MainClass {

	public static void main(String[] args) {
		Student stl = new Student ();
		stl.SayHello();
		//stl.SayHello();
		//Car c = new Car("Hyundai", 200);
		//c.maxSpeed(100);
//		c.maxSpeed = 200;
//		c.ShowInfo();
		
		Calcul cal = new Calcul ();
		int val = cal.addInt(1, 3);
		double vald = cal.add(1.0, 2.0);
		System.out.println("Value " + val);

	}

}
