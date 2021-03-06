
import java.util.ArrayList;
/**
 * A class to keep track of the statistics of queues
 * 
 * @author (Jeff) 
 * @version (a version number or a date)
 */
public class Stats implements Actor

{

    private int waitTime;
    private int statTick;
    private Queue queue;
    private Student student;
    private int tick;
    /**
     * Constructor for objects of class stats
     */
    public Stats(int tick)
    {
        tick=tick; 
        queue = new Queue();
        student = new Student(tick);
        waitTime = student.getCreationTick();
        statTick = student.getExitTick();
    }

    /**
     * returns wait time 
     */
    public int getWaitTime()
    {
        waitTime = waitTime + statTick;
        return waitTime;
    }

    /**
     * will return the largest size of the queue
     * 
     */
    public void act(int tick)//largestQueueSize
    {
       

        int length; //used to keep track of the size
        int length2;
        int actual = 0; //will hold the largest size
        length = queue.length();
        actual = length;
        if(tick % 10 == 0){
            length2 = queue.length(); //sets length2 to the new size of queue

            if(length2 > length){
                length2 = actual;
            } else {
                length = actual;
            }
        }
        System.out.println("largest queue size: " +actual);

    }

}
