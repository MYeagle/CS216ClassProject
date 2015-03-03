import java.util.ArrayList;

/**
 * Controller for class project.
 * 
 * @author (AJ) 
 * @version (1 at 2/18/15)
 */
public class Controller
{
    // instance variables - replace the example below with your own
    private int tick=0,i;
    private ArrayList<Actor> actors;
    private StudentSource studentSc;  
    /* private ArrayList<Student> students */
    private Queue q0,q1,q2,q3,q4;
    private ExitList qx;  //where students wind up when done
    private Station s0; /* s1,s2,s3,s4,sx - 1 station for each queue to start with*/
    private Stats stat1;  //generate styatistical output via act()
    
    
    /**
     * Constructor for objects of class Controller
     */
    public Controller()
    {
        // Create initial queues and stations
        q0 = new Queue(); //registration q
        q1 = new Queue(); //Financial Aid
        q2 = new Queue(); //Busar
        q3 = new Queue(); //Bookstore
        q4 = new Queue(); //What is this one for?
        qx = new ExitList(); //where students wind up when done
        
        
        
        s0= new Station(tick,q0,q1,q2,q3,q4,qx);
        /* s1= new Station(1,q1);
        s2= new Station(2,q2);
        s3= new Station(3,q3);  Will enable new stations after successful test of first*/
        studentSc = new StudentSource(q0);
        stat1 = new Stats(999);  //will need all the quieuie
        actors = new ArrayList<>();
        
        //Add all actor implementors
        actors.add(studentSc);
        actors.add(s0); //Add all actor implementors
        actors.add(stat1);
        
        /* students = new ArrayList<>(); */
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void MainLoop()
    {
        // Create Student(s)
        for (i=1;i<=25;i++)
        {
        tick++;
        /* s1 = new Student(tick);*/
        for (Actor ax : actors)
           ax.act(tick);
        System.out.print("Tick "+tick+" completed!\n");
        }
    }
}
