package exam05;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("Temp.txt");
		int ch;
		
		try {
		FileReader reader = new FileReader("Temp.txt");
		ch = reader.read();
	} catch (Exception e) {
		System.out.println("Error!!!")
	}
		try {
		FileOutputStream os = new FileOutputStream("Temp.txt");
		os.write(123);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
