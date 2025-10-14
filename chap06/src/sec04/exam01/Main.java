package sec04.exam01;

public class Main {

	public static void main(String[] args) {
		int gasTank = 100;
		int minGas = 20;
		int numOfRounds = 20;
		
		Car hyundai = new Car(gasTank, minGas, "Hyundai", "Yellow");
		
		int numOfRound = 0;
		while(numOfRound < numOfRounds)
		{
			numOfRound++;
			
			if(hyundai.IsLeftGas()) {
				hyundai.RunOneRound();
			}
			else {
				hyundai.AddGas(gasTank);
			}
		}
		

	}

}
