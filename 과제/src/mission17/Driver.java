package mission17;

public class Driver {
	public static void main(String[] args) {
		
		RemoteControl carRc = new RcCar();
		carRc.on();
		carRc.setSpeed(300);
		carRc.setSpeed(50);
		carRc.off();
		System.out.println();
		
		RemoteControl.changeBattery();
		
		System.out.println();
		RemoteControl droneRc = new Drone();
		droneRc.on();
		droneRc.setSpeed(200);
		droneRc.setSpeed(300);
		droneRc.off();
	}
}
