package exam02;

public class AnimalHospital {

	public static void main(String[] args) {
		AnimalHospital h = new AnimalHospital();
		
		Dog dog = new Dog(100);
		
		h.CheckPatient(dog);
		h.HealPatient(dog);

	}
	
	void CheckPatient(Dog dog) {
		if(dog.IsHealthy()) {
			System.out.println("Healthy!");
		}
		else {
			System.out.println("Sick!");
		}
		
	}
	
	void HealPatient(Dog dog) {
		dog.Heal();
		
	}

}
