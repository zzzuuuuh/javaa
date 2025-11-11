package exam03;

public class Main {

	public static void main(String[] args) {
		Button callBtn = new Button();
		callBtn.SetOnClickListener(
				new Button.OnClickListener() {
					public void OnClick() {
						System.out.println("Make a phone!!")
			   }
		};
		callBtn.Touch();


	}

}
