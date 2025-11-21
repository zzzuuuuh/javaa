package exam06;

public class Myclass {
	
	RemoteControl rc = new Television();
	
	Myclass() {
	}
	
	Myclss(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
}
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
