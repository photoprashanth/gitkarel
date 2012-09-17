package pra;

import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.UrRobot;

public class Karel002 extends Robot{
	public Karel002(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Karel002 karel = new Karel002(2,2,East,0);
		karel.setVisible(true);
		karel.move();
	}

}
