public class Station implements Actor
{
    // instance variables - replace the example below with your own
    // My station number (0...3 = offset into Student)
    //  q0_ref, q1_ref...  refs to all the queuea
    //--current student ref

    private int stationId;
    private Queue currentQueue; //The queue we are getting the student from
    private Queue nextQueue; //The next Queue currentStudent is going to
    private Queue q0; //Registration
    private Queue q1; //Financial Aid
    private Queue q2; //Bursar
    private Queue q3; //Bookstore
    private ExitList qx; //Exit Queue
    private Student currentStudent; //placeholder for enqueue
    private StationData duration;
    private StationData entry;

    /**
     * Constructor for objects of class Station
     */
    public Station(int id,Queue ref0, Queue ref1, Queue ref2, Queue ref3, ExitList ref5)
    {
        if (id == 0) //controller id
        {
            currentQueue = ref0;
            nextQueue = ref1;
        }

        if (id == 1)
        {
            currentQueue = ref1;
            nextQueue = ref2;
        }

        if (id == 2)
        {
            currentQueue = ref2;
            nextQueue = ref3;
        }
        if (id == 3)
        {
            currentQueue = ref3;
            qx=ref5;
        }

        q0 = ref0;//Registration
        q1 = ref1;//Financial Aid
        q2 = ref2; //bursar
        q3 = ref3; //bookstore
        qx = ref5; //exit queue
        stationId=id; //what station it is referencing

    }

    public void act (int tick)
    {

        if(currentStudent == null) //if there is no current student
        {
            currentStudent = currentQueue.dequeue(); // takes a student out
            if(currentStudent == null)
            {
                return;
            }
            currentStudent.getStationData(stationId).setStationEntry(tick);

        }

        else
        {

        }
        //if student is still null there is nothing to do.....


        if(currentStudent != null)
        {
            if(
            (currentStudent.getStationData(stationId).getStationEntry()) + 
            (currentStudent.getStationData(stationId).getDuration()) == tick) //if the current student is ready to leave
            {
                if(stationId < 3)
                {
                    nextQueue.enqueue(currentStudent); //Puts student into next queue, not reading what queues they have been to yet
                    currentStudent = null; //Make current student null after throwing into a queue
                }
                else
                {
                    currentStudent.setExitTick(tick); //sets the exit tick
                    qx.add(currentStudent);
                    currentStudent = null; //Make current student null after throwing into a queue
                }
            }
        }

        if(currentStudent == null) //process another student when the last student leaves
        {
            currentStudent = currentQueue.dequeue(); // takes a student out
			if(currentStudent == null)
            {
                return;
            }
            currentStudent.getStationData(stationId).setStationEntry(tick);
        }

    }
}

