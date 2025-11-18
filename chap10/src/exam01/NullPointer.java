package exam01;

public class NullPointer {
	
	public static void main(String[] args) {
		String data = null;
		
		try {
			//data = new String("Hi");
			System.out.println(data.toString());
			System.out.println("It is OK!!");
		}
//		catch(NullPointerException e) {
		catch(ClassCastException e) {
			//System.out.println(e);
			System.out.println("Null Pointer!!");
			
		}
		finally {
			System.out.println("Exception module done.");
		}
		System.out.println("Program is runnung!!");
	}

}
