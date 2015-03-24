
/**
 * Write a description of class StationData here.
 * 
 * @author (Baljit Kaur) 
 * @version (a version number or a date)
 */
public class StationData
{
    private int queueEntry;
    private int duration;
    private int stationEntry;
    /**
     * Constructor for objects of class StationData
     */
    public StationData(int tick, int entry, int dur)
    {
        stationEntry = tick;
        queueEntry = entry;
        duration = dur;
    }
    
    public void setStationEntry(int s)
    {
        stationEntry = s;
    }
    
    public void setDuration(int d)
    {
        duration = d;
    }
    
    public void setQueueEntry(int q)
    {
        queueEntry = q;
    }
    
    public int getStationEntry()
    {
        return stationEntry;
    }
    
    public int getQueueEntry()
    {
        return queueEntry;
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    public void printResults()
    {
        System.out.println("Station Entry :" + stationEntry);
        System.out.println("Queue Entry :" + queueEntry);
        System.out.println("Duration :" + duration);
    }
}
