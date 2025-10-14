package sec04.exam01;

public class Car {
	int gas;
	int minGas; // 한 바퀴 돌 때 필요한 Gas
	String teamName;
	String color;
	
	Car(int gas, int minGas, String teamName, String color) {
		this.gas = gas;
		this.minGas = minGas;
		this.teamName = teamName;
		this.color = color;
	}

	
	boolean IsLeftGas() {
		if(gas < minGas) {
			System.out.println("Need Fuel.");
			return false;
		}
		
		System.out.println("Can run one more");
		return true;

	}
	
	void AddGas(int gas) {
		System.out.println("Full tank");
		this.gas += gas;
	}
	
	
	void RunOneRound ()
	{
		System.out.println("한바퀴 완주");
		this.gas -= minGas;
	}

}
