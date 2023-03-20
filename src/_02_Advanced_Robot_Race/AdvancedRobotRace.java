package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot one = new Robot(100,100);
		Robot two = new Robot(100,300);
		Robot three = new Robot(100,500);
		Robot four = new Robot(100,700);
		Robot five = new Robot(100,900);
		Random ran = new Random();
		Thread r1 = new Thread(()->{
			Robot temp = one;
			int lap = 0;
			temp.setSpeed(10);
			temp.turn(90);
			for (int i = 0; i > -1; i++) {
				temp.move(ran.nextInt(80));
				if(temp.getX()>=1800 && lap<5) {
					temp.setX(-200);
					lap++;
				}
				if(lap==5) {
					System.out.println(temp+" has finished!");
					break;
				}
			}
		});
		r1.start();

	}
}
