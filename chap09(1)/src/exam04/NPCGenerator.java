package exam04;

public class NPCGenerator {
	Person worker = new Person() {
		void Wake() {
			System.out.println("Wake up at 6!!");
			Work();
		}
		
		void Work() {
			System.out.println("GO to walk!!");
		}
	};
	void GeneratorWalker() {
		Person walker = new Person() {
			
		};
		
		walker.Wake();
	}
	
	void GeneratorPerson(Person person) {
		person.Wake();
	}
}
