package exam01;

public class Main {

	public static void main(String[] args) {
		Button callBtn = new button();
		callBtn.SetOnClickListener(new CallListener());
		callBtn.Touch();
		
		Button mBtn = new button();
		mBtn.SetOnClickListener(new MessageListener());
		mBtn.Touch();
	}

}
