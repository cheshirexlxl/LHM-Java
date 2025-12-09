package mission17;

public interface RemoteControl {
	
	int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	
	void on();					// 전원 On
	void off();					// 전원 Off
	void setSpeed( int speed);	// 속도설정
	
	// 배터리 교체
	static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
	
}
