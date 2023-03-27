package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static boolean raceOver = false;
	public static void main(String[] args) {
		raceOver = false;
		Random ran = new Random();
		for (int j = 1; j < 6; j++) {
			int pos = (j-1)*200 + 100;
			int j2 = j;
			Thread r1 = new Thread(()->{
				Robot temp = new Robot(100,pos);
				int lap = 0;
				temp.setSpeed(10);
				temp.turn(90);
				for (int i = 0; i > -1; i++) {
					temp.move(ran.nextInt(81));
					if(temp.getX()>=1800 && lap<5) {
						temp.setX(-200);
						lap++;
					}
					if(lap==5) {
						if(!raceOver) {
							raceOver=true;
							JOptionPane.showMessageDialog(null, "Robot "+j2+" has won!");
						}
						break;
					}
				}
			});	
			r1.start();
		}

	}
}
