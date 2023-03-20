package _01_Olympic_Rings;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class OlympicRings_Threaded {
	
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
    
public static void main(String[] args) {
    Robot one = new Robot(100,300);
    Robot two = new Robot(400,600);
    Robot three = new Robot(700,300);
    Robot four = new Robot(1000,600);
    Robot five = new Robot(1300,300);
    
    one.setSpeed(10);
    two.setSpeed(10);
    three.setSpeed(10);
    four.setSpeed(10);
    five.setSpeed(10);
    one.setPenColor(Color.BLUE);
    two.setPenColor(Color.YELLOW);
    three.setPenColor(Color.BLACK);
    four.setPenColor(Color.GREEN);
    five.setPenColor(Color.RED);
    one.penDown();
    two.penDown();
    three.penDown();
    four.penDown();
    five.penDown();
    Thread r1 = new Thread(()->{
    	for(int i=0;i<360;i++) {
    		one.turn(1);
    		one.move(4);
    	}
    	one.hide();
    		});
    Thread r2 = new Thread(()->{
    	for(int i=0;i<360;i++) {
    		two.turn(1);
    		two.move(4);
    	}
    	two.hide();
    		});
    Thread r3 = new Thread(()->{
    	for(int i=0;i<360;i++) {
    		three.turn(1);
    		three.move(4);
    	}
    	three.hide();
    		});
    Thread r4 = new Thread(()->{
    	for(int i=0;i<360;i++) {
    		four.turn(1);
    		four.move(4);
    	}
    	four.hide();
    		});
    Thread r5 = new Thread(()->{
    	for(int i=0;i<360;i++) {
    		five.turn(1);
    		five.move(4);
    	}
    	five.hide();
    		});
    r1.start();
    r2.start();
    r3.start();
    r4.start();
    r5.start();
    
    
}
}

