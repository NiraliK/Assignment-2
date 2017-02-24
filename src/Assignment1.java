
import apple.laf.JRSUIConstants;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class Assignment1 {

    private static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();

        // new robot is created 
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        // create path for things 
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        //show thing count 
        kw.showThingCounts(true);

        //karel move to step 1
        karel.move();

        //create while loop
        // if thing is there, pick it up
        while (karel.canPickThing()) {
            karel.pickThing();
            karel.move();

            // count things in backpack and stop at 7
            if (karel.countThingsInBackpack() == 7) {
                break;
            }
        }

        //karel move pass the other things 
        karel.move();
        karel.move();
    }
}
