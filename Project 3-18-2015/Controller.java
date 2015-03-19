import java.util.ArrayList;

/**
 * Controller for class project.
 * 
 * @author (AJ) 
 * @version (1.1 at 2/27/15) 
 * @version (1.2 at 3/3/15)
 * @version (1.3 at 3/17/15) changes made in class with Weissman
 * @version (1.4 at 3/18/15) changes made during conference call...
 */
public class Controller
{
    // instance variables - replace the example below with your own
    private int tick=0,i;
    private ArrayList<Actor> actors;
    private StudentSource StudentSc;
    private Queue q0,q1,q2,q3,q4;
    private ExitList qx;  //where students wind up when done
    private Station s0,s1,s2,s3,s4; //,sx - 1 station for each queue to start with*/
    private Stats stat0;  //generate styatistical output via act()
    private Student checkStudent;

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
        //q4 = new Queue(); //What is this one for?
        qx = new ExitList(); //where students wind up when done
        
        StudentSc= new StudentSource(q0); 
        stat0 = new Stats(q0,q1,q2,q3); //new 3/17/15
        
        s0= new Station(0,q0,q1,q2,q3,qx);  //Processes students in Registration q0
        s1= new Station(1,q0,q1,q2,q3,qx);  //Processes students in Financial Aid q1
        s2= new Station(2,q0,q1,q2,q3,qx);  //Processes students in Bursar q2
        s3= new Station(3,q0,q1,q2,q3,qx);  //Processes students in Bookstore q3
        //s4= new Station(4,q0,q1,q2,q3,q4,qx);  //Will enable new stations after successful test of first
        
        actors = new ArrayList<>();
        actors.add(StudentSc);
        actors.add(s0);
        actors.add(s1);
        actors.add(s2);
        //actors.add(s3);
        actors.add(stat0);//Add all actor implementors
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void MainLoop()
    {
        // Create Student(s)
        for (i=1;i<=21;i++)
        {
           tick++;
        
           for (Actor ax : actors)
              ax.act(tick);
           
           //System.out.print(q0.length()+" is the current size of the Registration queue\n");
           //System.out.print(q1.length()+" is the current size of the Financial Aid queue\n");
           //System.out.print(q2.length()+" is the current size of the Bursar queue\n");
           //System.out.print(q3.length()+" is the current size of the Book Store queue\n");
           System.out.print(qx.getSize()+" is the current size of the Exit list\n");
           
           if(i%7==0)
           {
               if(q0.length()>3)
               {
                  checkStudent=q0.getStudent(i%4);
                  System.out.print("Student "+i%4+":"+"q0: Complete Station data follows...\n");
                  checkStudent.printStationData();
               }
               if(q1.length()>3)
               {
                  checkStudent=q1.getStudent(i%4);
                  System.out.print("Student "+i%4+":"+"q1: Complete Station data follows...\n");
                  checkStudent.printStationData();
               }
               if(q2.length()>3)
               {
                  checkStudent=q2.getStudent(i%4);
                  System.out.print("Student "+i%4+":"+"q2: Complete Station data follows...\n");
                  checkStudent.printStationData();
               }
               if(q3.length()>3)
               {
                  checkStudent=q3.getStudent(i%4);
                  System.out.print("Student "+i%4+":"+"q3: Complete Station data follows...\n");
                  checkStudent.printStationData();
               }
           }
           System.out.print("Tick "+tick+" completed!\n\n");
        }
    }
}
