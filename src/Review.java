import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Review {
	static Random randGen = new Random();

	public static void main(String[] args) {

		while (0 == 0) {
			drawWeirdShape(randGen.nextInt(50), randGen.nextInt(200), randGen.nextInt(200) - 100, randGen.nextInt(10),
					randGen.nextInt(10), randGen.nextInt(200), randGen.nextInt(200) - 100, randGen.nextInt(10),
					randGen.nextInt(200), randGen.nextInt(200) - 100);
		}
	}

	static void drawWeirdShape(int ran1, int ran2, int ran3, int ran4, int ran5, int ran6, int ran7, int ran8, int ran9,
			int ran10) {
		Robot rob = new Robot();
		Robot dave = new Robot();
		Robot joe = new Robot();
		rob.penDown();
		dave.penDown();
		joe.penDown();
		rob.setSpeed(10000);
		dave.setSpeed(10000);
		joe.setSpeed(10000);
		rob.setPenWidth(ran4);
		dave.setPenWidth(ran5);
		joe.setPenWidth(ran8);

		for (int i = 0; i < ran1; i++) {
			rob.setRandomPenColor();
			dave.setRandomPenColor();
			joe.setRandomPenColor();
			rob.move(ran2);
			dave.move(ran6);
			joe.move(ran9);
			rob.turn(ran3);
			dave.turn(ran7);
			joe.turn(ran10);
			drawWeirderShape(randGen.nextInt(50), randGen.nextInt(200), randGen.nextInt(200) - 100, randGen.nextInt(10),
					randGen.nextInt(10), randGen.nextInt(200), randGen.nextInt(200) - 100, randGen.nextInt(10),
					randGen.nextInt(200), randGen.nextInt(200) - 100);
		}
	}

	static void drawWeirderShape(int ran1, int ran2, int ran3, int ran4, int ran5, int ran6, int ran7, int ran8,
			int ran9, int ran10) {
		Robot rob = new Robot();
		Robot dave = new Robot();
		Robot joe = new Robot();
		rob.penDown();
		dave.penDown();
		joe.penDown();
		rob.setSpeed(10000);
		dave.setSpeed(10000);
		joe.setSpeed(10000);
		rob.setPenWidth(ran4);
		dave.setPenWidth(ran5);
		joe.setPenWidth(ran8);

		for (int i = 0; i < ran1; i++) {
			rob.setRandomPenColor();
			dave.setRandomPenColor();
			joe.setRandomPenColor();
			rob.move(ran2);
			dave.move(ran6);
			joe.move(ran9);
			rob.turn(ran3);
			dave.turn(ran7);
			joe.turn(ran10);
			drawWeirdShape(randGen.nextInt(50), randGen.nextInt(200), randGen.nextInt(200) - 100, randGen.nextInt(10),
					randGen.nextInt(10), randGen.nextInt(200), randGen.nextInt(200) - 100, randGen.nextInt(10),
					randGen.nextInt(200), randGen.nextInt(200) - 100);
		}
	}
}
