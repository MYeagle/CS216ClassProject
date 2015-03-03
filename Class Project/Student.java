
/**
 * Write a description of class Student here.
 * 
 * @author (Baljit Kaur) 
 * @version (a version number or a date)
 */
public class Student
{
    // Instance variables for class student.
    private int creationTick; //time at which student is created
    private int exitTick; //tick at which all processing is completed
    private StationData [] processStation; 
    /**
     * Takes in the starting tick. Constructs a new student.
     */
    public Student(int tick)
    {   
        creationTick = tick;
        // Data for possible stations
        // registration = 0;
        // bursar = 1;
        // financialAid = 2;
        // bookStore = 3;
        processStation = new StationData[4];
        for (int count = 0; count < processStation.length; count++)
        {
            processStation[count] = new StationData(tick, 0, 0); 
            exitTick = 0;
        }

        processStation[0].setDuration(3); //random duration for now
        processStation[1].setDuration(1);
        processStation[2].setDuration(4);
        processStation[3].setDuration(2);
    }

    public StationData getStationData(int num)
    {
        StationData s = null;
        if (num == 0)
        {
            s = processStation[0];
        }
        else if (num == 1)
        {
            s =  processStation[1];
        }
        else if (num == 2)
        {
            s =  processStation[2];
        }
        else if (num == 3)
        {
            s = processStation[3];
        }
        return s;
    }

    /**
     * Returns the creation tick.
     */
    public int getCreationTick()
    {
        return creationTick;
    }

    public int getExitTick()
    {
        return exitTick;
    }
}