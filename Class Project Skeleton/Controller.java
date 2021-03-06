
/**
 * Controller for class project.
 * 
 * @author (AJ) 
 * @version (1 at 2/18/15)
 */

import java.util.ArrayList;
public class Controller 
{
    // instance variables - replace the example below with your own
    private int tick=0;
    private ArrayList<Actor> actors;
    private Queue q0,q1,q2,q3,q4,qx;  //registration=0  
    private Station s0; //reqistration
    // ...
    //create a StudentSource as an Actor

    /**
     * Constructor for objects of class Controller
     */
    public Controller()
    {
        // Create initial queues and stations
         q0 = new Queue();  //registration q
        
        // p[arameters are id of station, 4 queues, completed q)
         s0 = new Station(0, q0, q1, q2, q3, qx);
         
         //Student soiurce ss is an actor
         
         actors = new ArrayList<>();  
         actors.add(s0);  // add all Actor implementors
         //actors.add(myStudentSorce);
    }

    /**
     *  main loop
     */
    public void registerLoop()
    {
        tick++;
        for(Actor ax : actors)
           ax.act(tick);
        
        
    }
}
