package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {

	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(75 + i * 175);
			robots[i].setY(500);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
		while (robots[1].getY() >= 0 && robots[2].getY() >= 0 && robots[3].getY() >= 0 && robots[4].getY() >= 0 && robots[0].getY() >= 0) {
			for (int i = 0; i < 5; i++) {
				Random r = new Random();
				int random = r.nextInt(50);
				robots[i].move(random);
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!
		if(robots[1].getY() <= 0) {
			System.out.println("Robot 2 wins!");
		}
		else if(robots[2].getY() <= 0) {
			System.out.println("Robot 3 wins!");
		}
		else if(robots[3].getY() <= 0) {
			System.out.println("Robot 4 wins!");
		}
		else if(robots[4].getY() <= 0) {
			System.out.println("Robot 5 wins!");
		}
		else if(robots[0].getY() <= 0) {
			System.out.println("Robot 1 wins!");
		}
	//8. try different races with different amounts of robots.
		Robot[] robots1 = new Robot[3];

			for (int i = 0; i < robots1.length; i++) {
				robots1[i] = new Robot();
				robots1[i].setX(75 + i * 175);
				robots1[i].setY(500);
			}

			while (robots1[1].getY() > 0 && robots1[2].getY() > 0 && robots1[0].getY() > 0) {
				for (int i = 0; i < robots1.length; i++) {
					Random r = new Random();
					int random = r.nextInt(50);
					robots1[i].move(random);
				}
			}

			if(robots1[1].getY() <= 0) {
				System.out.println("Robot 2 wins!");
			}
			else if(robots1[2].getY() <= 0) {
				System.out.println("Robot 3 wins!");
			}
			else if(robots1[0].getY() <= 0) {
				System.out.println("Robot 1 wins!");
			}

	//9. make the robots race around a circular track.
			Robot[] robots2 = new Robot[3];

			for (int i = 0; i < robots2.length; i++) {
				robots2[i] = new Robot();
				robots2[i].setX(75);
				robots2[i].setY(500);
			}

			while (robots2[1].getX() > 0 && robots2[2].getX() > 0 && robots2[0].getX() > 0) {
				for (int i = 0; i < robots2.length; i++) {
					Random r = new Random();
					int random = r.nextInt(50);
					robots2[i].move(random);
					if(robots2[i].getY() < 0) {
						robots2[i].turn(90);
						robots2[i].setY(0);
					}
					if(robots2[i].getX() > 750) {
						robots2[i].turn(90);
						robots2[i].setX(1000);
					}
					if(robots2[i].getY() > 500) {
						robots2[i].turn(90);
						robots2[i].setY(500);
					}
				}
			}

			if(robots2[1].getX() <= 0) {
				System.out.println("Robot 2 wins!");
			}
			else if(robots2[2].getX() <= 0) {
				System.out.println("Robot 3 wins!");
			}
			else if(robots2[0].getX() <= 0) {
				System.out.println("Robot 1 wins!");
			}
	}
}