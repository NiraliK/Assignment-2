
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class Assignment4 {

    public static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city 
        City kw = new City();

        //create robot 
        Robot gugu = new Robot(kw, 0, 0, Direction.EAST);

        //create wall path 
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);

        // move karel around the path 
        //create a loop
        while (true) {
            gugu.move();
            gugu.move();
            gugu.turnLeft();
            gugu.turnLeft();
            gugu.turnLeft();
            gugu.move();
            gugu.turnLeft();
            gugu.move();
            gugu.turnLeft();
            gugu.move();
            gugu.turnLeft();
            gugu.turnLeft();
            gugu.turnLeft();
            gugu.move();
            gugu.move();
            gugu.turnLeft();
            gugu.turnLeft();
            gugu.turnLeft();

        }
    }
}
