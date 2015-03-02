
/**
 * Write a description of class StationData here.
 * 
 * @author (your name) 
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
    
    public void setDuration(int d)
    {
        duration = d;
    }
    
    public void setQueueEntry(int q)
    {
        queueEntry = q;
    }
}
