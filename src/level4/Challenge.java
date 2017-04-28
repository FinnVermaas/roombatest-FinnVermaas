package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
straight();
		turnLeft();
		straight();
	turnRight();
	straight();
	}
public void turnLeft(){
	driveDirect(-100,100);
	sleep(1700);
}
public void turnRight(){
	driveDirect(100,-100);
	sleep(1700);
}
public void straight(){
	driveDirect(100,100);
	sleep(5500);
}
	public void loop() {

	}
}
