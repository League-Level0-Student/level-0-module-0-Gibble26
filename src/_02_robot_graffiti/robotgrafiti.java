package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robotgrafiti {
public static void main(String[] args) {
	Robot a = new Robot();
	a.penDown();
	a.setSpeed(50);
	a.turn(90);
	a.move(200);
	
	for (int i = 0; i < 10.; i++) {
		a.turn(9);
		a.move(1);
	}
	a.move(300);
	a.turn(90);
	a.move(200);
	a.turn(90);
	a.move(300);
}
}
