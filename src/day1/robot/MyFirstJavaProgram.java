package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Conrad = new Robot("batman");
		for (int i = 0; i <4; i++) {
			Conrad.penDown();
			Conrad.setPenColor(255, 0, 0);
			Conrad.setSpeed(10);
			Conrad.move(200);
			Conrad.turn(90);
			
		}
		Conrad.sparkle();
		Conrad.penDown();
		Conrad.setPenColor(0, 0, 255);
		Conrad.setPenWidth(5);
		Conrad.miniturize();
		Conrad.setSpeed(10);
		Conrad.move(100);
		Conrad.turn(90);
		Conrad.move(100);
		Conrad.turn(90);
		Conrad.move(100);
		Conrad.turn(90);
		Conrad.move(100);
		Conrad.turn(90);
		Conrad.move(100);
		Conrad.move(100);
		Conrad.turn(90);
		Conrad.move(200);
		Conrad.turn(90);
		Conrad.move(300);
		Conrad.turn(90);
		Conrad.move(300);
		Conrad.turn(90);
		Conrad.move(300);
		Conrad.turn(90);
		Conrad.move(300);
	}
}
