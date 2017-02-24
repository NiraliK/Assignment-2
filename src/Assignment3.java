
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class Assignment3 {

    public static City milton;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creating new city 
        City milton = new City();

        //new robot created 
        Robot karel = new Robot(milton, 5, 2, Direction.EAST);

        // karel get to the direction north 
        //create a loop
        while (karel.getDirection() != Direction.NORTH) {
            karel.turnLeft();
        }

        // karel get the street 0
        //create a loop
        while (karel.getStreet() != 0) {
            karel.move();
        }

        // karel get the direction west 
        // create loop 
        while (karel.getDirection() != Direction.WEST) {
            karel.turnLeft();
        }

        // karel get the avenue 0
        //create a loop
        while (karel.getAvenue() != 0) {
            karel.move();
        }
    }
}
