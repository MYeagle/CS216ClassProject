
import java.util.Random;
/**
 * Write a description of class StudentSource here.
 * 
 * @author (Nabaraj L) 
 * @version (a version number or a date)
 */

public class StudentSource extends Controller
{
    //random number generator 
    Random rgen = new Random();
    private Queue currentQueue;

    //construct gets the que list from the station

    public StudentSource(Queue cQueue)
    {
              currentQueue = cQueue; //  super.Controller(que);
    }

    // puts the student enque 
    public void act(int tick)
    {
        // creates 2 random number : 0 or 1.
        int rand = rgen.nextInt(2);

        //creates 3 students if the random number is 1.
        for (int x = 1; x < 3; x++)
        {

            if (rand == 0)
            {
                // do nothing
            }

            else if (rand ==1) 
            //create 3 students and add to the arrylist of students in the class Station
            {
                Student s = new Student (tick);
                currentQueue.enqueue(new Student(tick));

                
            }
        }
    }

}
