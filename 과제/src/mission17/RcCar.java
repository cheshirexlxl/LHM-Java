package mission17;

public class RcCar implements RemoteControl {
	double battery;
	double speed;
	
	@Override
	public void on() {		
		System.out.println("RC카 전원을 켭니다.");
	}
	
	@Override
	public void off() {		
		System.out.println("RC카 전원을 끕니다.");
	}
	
	@Override
	public void setSpeed(int speed) {		
		if(speed > RemoteControl.MAX_SPEED) {
			this.speed = RemoteControl.MAX_SPEED;
			System.out.println("최대 속력입니다.");
		}
		else if(speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
			System.out.println("최저 속력입니다.");
		}
		else {
			this.speed = speed;
		}
		System.out.println("현재 속도는 " + this.speed + " 입니다.");
	}
	
	
}
