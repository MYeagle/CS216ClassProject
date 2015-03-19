
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
    private Queue x;
    private Queue w;
    private Queue y;
    private Queue z;
    private Student student;

    /**
     * Constructor for objects of class stats
     */
    public Stats(Queue w, Queue x, Queue y, Queue z)
    {
        this.x = x;
        this.w = w;
        this.y = y;
        this.z = z;

        student = x.getStudent(0);
        //waitTime= student.getCreationTick();
        //statTick = student.getExitTick();
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

        int length; //used to keep track of the size registration queue
        int length2;// used track to keep size of registration queue
        int actual = 0; //will hold the largest size
        length = w.length();
        actual = length;
        if(tick % 10 ==0)
        {
            length2 = w.length(); //sets length2 to the new size of queue

            if(length2 > length){
                length2 = actual;
            } else {
                length = actual;
            }
        }
        

        int length3; //used to keep track of the size
        int length4;// used track to keep size of financial aid queue
        int actual1 = 0; //will hold the largest size
        length3 = x.length();
        actual1 = length3;
        if(tick % 10 ==0)
        {
            length4 = x.length(); //sets length2 to the new size of queue

            if(length4 > length3){
                length4 = actual1;
            } else {
                length3 = actual1;
            }
        }
        
        int length5; //used to keep track of the size
        int length6;// used track to keep size of bursar queue
        int actual2 = 0; //will hold the largest size
        length5 = y.length();
        actual2 = length5;
        if(tick % 10 ==0)
        {
            length6 = y.length(); //sets length2 to the new size of queue

            if(length6 > length5){
                length6 = actual2;
            } else {
                length5 = actual2;
            }
        }
        

        int length7; //used to keep track of the size 
        int length8;// used track to keep size of bookstore
        int actual3 = 0; //will hold the largest size
        length7 = x.length();
        actual3 = length7;
        if(tick % 10 ==0)
        {
            length8 = x.length(); //sets length2 to the new size of queue

            if(length8 > length7){
                length8 = actual3;
            } else {
                length7 = actual3;
            }
        }
        
       
        
        System.out.println("largest queue size for registration: " +actual);
        System.out.println("largest queue size for financial aid: " +actual1);
        System.out.println("largest queue size for bursar: " +actual2);
        System.out.println("largest queue size for the bookstore: " +actual3);
    }
}
