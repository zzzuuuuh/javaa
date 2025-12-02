package exam01;

public class Main {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("Downloading");
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {}
	}
		for(int i=0; i<5; i++) {
			System.out.println("Drawing!!!");
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
