
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author niralikantaria
 */
public class countedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city created 
        City kw = new City();

        //create a robot 
        RobotSE gugu = new RobotSE(kw, 1, 1, Direction.EAST);

        //make a counter 
        int counter = 0;
        //move 5 time using the condition 
        while (counter < 5) {
            //move 
            gugu.move();
            // increase the counter!
            counter = counter + 1;
            // short cut to add 1: counter++; counter +=1;
            //short cut to subtract 1:counter--;   
        }

        gugu.turnAround();

        //usign a four loop to count
        //for (define a variable; condition to loop; change variable 
        for (int i = 0; i < 5; i = i + 1) {
            gugu.move();

        }
        //COMPOUND CONDITIOND 
        // && <- AND STATEMENT: both must be true 
        // || <- OR STATEMENT: one of them must be true 
        if (gugu.frontIsClear()) {
            if (gugu.countThingsInBackpack() == 5) {
                // do something   
            }
        }

        if (gugu.frontIsClear() && gugu.countThingsInBackpack() == 5) {
        // do something    
        }        
        
        if(gugu.frontIsClear()) {
            // do something 
        }else if (gugu.countThingsInBackpack() ==5) {
        // do sam thing as above if the stamte 
        }
        
        if (gugu.frontIsClear() || gugu.countThingsInBackpack() == 5);
        
        }
    }
