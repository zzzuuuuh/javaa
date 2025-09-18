package sec03.exam03;

import java.util.Scanner;

public class Looptest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		 while(choice ! = 1 && choice ! = 3)
		 {
			 System.out.println("================");
			 System.out.println(" Play game : 1");
			 System.out.println(" Quit game : 3");
			 System.out.println("================");
			 
			 choice = scan.nextInt();
		 }

	}

}
