package exam02;

public class Main {

	public static void main(String[] args) {
		
		public static void main(String[] args) {
			Button callBtn = new button();
			callBtn.SetOnClickListener(new CallListener());
			callBtn.Touch();
			
			Button mBtn = new button();
			mBtn.SetOnClickListener(new MessageListener());
			mBtn.Touch();
		}
		
	}

}
