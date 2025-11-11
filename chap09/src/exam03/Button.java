package exam03;

import exam02.Button.OnClickListener;

public class Button {
	OnClickListener listener;
			
		public void SetOnClickListener(OnClickListener Listener)
			  this.listener = listener;
			
		public void Touch() {
			if(listener != null) {
				listener.OnClick();
				}
			}
			
			interface OnClickListener {
				void OnClick();

			}

		}

}
