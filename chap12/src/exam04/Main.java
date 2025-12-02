package exam04;

public class Main {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Thread Name : " + mainThread.getName());
		
		Thread ThreadA = new ThreadA ();
		System.out.println("Thread Name : " + threadA.getName());

	}

}
