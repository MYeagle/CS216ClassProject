/**
 * A class to keep track of the statistics of queues
 * 
 * @author (Jeff) 
 * @version (a version number or a date)
 */
public class Stats

{
    
    private int waitTime;
    private int statTick;
    
    /**
     * Constructor for objects of class stats
     */
    public Stats(int tick)
    {
       statTick = tick;
    }

    /**
     * returns wait time 
     */
    public int getWaitTime()
    {
        statTick = waitTime;
        return waitTime;
    }

    /**
     * will return the largest size of the queue
     * 
     */
    public void largestQueueSize(Queue x)
    {
        int length; //used to keep track of the size
        int length2;
        int actual = 0; //will be largest size
        length = x.length();
        actual = length;
        if(statTick % 10 == 0){
            length2 = x.length(); //sets length2 to the new size of queue

            if(length2 > length){
                length2 = actual;
            } else {
                length = actual;
            }
        }
        System.out.println("largest queue size: " +actual);

    }


}
