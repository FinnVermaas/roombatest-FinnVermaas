package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		turn90();
		straight();
		turn90();
	
		
	}
public void turn90(){
	driveDirect(415,500);
	sleep(5100);
}
public void straight(){
	driveDirect(100,100);
	sleep(12500);
}
	public void loop() {
	
	}
}
