package exam08;

public class Main {

	public static void main(String[] args) {
//		String str1 = "Hi";
//		String str2 = str1;
//		
//		str1 += "!!!";
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		System.out.println(str1 == str2);
		
		Integer a = 10;
		AddVal(a);
		
		System.out.println(a);

	}
	
	static void AddVal (Integer a) {
		a += 10;
		System.out.println("AddVal : " + a);
	}

}
