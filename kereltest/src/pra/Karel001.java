package pra;

import kareltherobot.RobotTask;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Karel001 implements RobotTask {
	public void task() {
		World.readWorld("fig1-2a.kwld");
		UrRobot karel = new UrRobot(3,3,East,infinity);
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
	}

}
