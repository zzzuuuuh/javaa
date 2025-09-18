package sec03.exam01;


import java.io.
import java.io.
import java.util.Scanner;
public class ReadTest {
	
	public static void main (String[] args) {
		while(true) {
			try {
				int code = System.in.read();
				System.out.println("Code : " + code);
				if(code =='q') break;
			} catch (IOExcception e) {
				//TODO Auto-generated catch block
				e.PrintStackTrace();
			}
		}
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int code = scan.nextInt();
			System.out.println("code;" + code);
			if(code == 'q') break;
		}
		while(true) {
			int code = scan.nextLine();
			System.out.println("code;" + code);
			if(code.equals("q")) break;

		}
	}


}
