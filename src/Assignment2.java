
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class Assignment2 {

    public static City milton;

    public static void main(String[] args) {

        //new city created 
        City milton = new City();

        // new robot created 
        Robot karel = new Robot(milton, 4, 1, Direction.EAST);

        // hurdles path is created 
        new Wall(milton, 4, 1, Direction.EAST);
        new Wall(milton, 4, 2, Direction.EAST);
        new Wall(milton, 4, 4, Direction.EAST);
        new Wall(milton, 4, 7, Direction.EAST);

        // base path is created 
        new Wall(milton, 4, 1, Direction.SOUTH);
        new Wall(milton, 4, 2, Direction.SOUTH);
        new Wall(milton, 4, 3, Direction.SOUTH);
        new Wall(milton, 4, 4, Direction.SOUTH);
        new Wall(milton, 4, 5, Direction.SOUTH);
        new Wall(milton, 4, 6, Direction.SOUTH);
        new Wall(milton, 4, 7, Direction.SOUTH);
        new Wall(milton, 4, 8, Direction.SOUTH);
        new Wall(milton, 4, 9, Direction.SOUTH);

        // new thing created 
        new Thing(milton, 4, 9);

        //create a loop
        while (!karel.canPickThing()) {

            // turn left if front is not clear
            if (!karel.frontIsClear()) {
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
            }
            // karel move if front is clear
            if (karel.frontIsClear()) {
                karel.move();
            }
            //karel pick up thing 
            if (karel.canPickThing()) {
                karel.pickThing();
                break;
            }
        }
    }
}
