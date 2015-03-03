public class Station implements Actor
{
    // instance variables - replace the example below with your own
    // My station number (0...3 = offset into Student)
    //  q0_ref, q1_ref...  refs to all the queuea
    //--current student ref
    
    private int referenceTick;
    private Student currentStudent;
    Queue ref0 = new Queue();
    Queue ref1 = new Queue();
    /**
     * Constructor for objects of class Station
     */
    public Station(int id,Queue ref0, Queue ref1, Queue ref2, Queue ref3, Queue ref4,ExitList qx)
    {
        currentStudent = null;
    }

    public void act (int tick)
    {
        if(currentStudent == null) 
        {
            ref0.dequeue(); // adds a student if currentStudent is empty  
            referenceTick = tick;
            if (tick == (referenceTick + 3)) //tick has to be finished
            {
                ref1.enqueue(currentStudent); //takes the student off
            }
        }
        else
        {
            tick++; //counts up the tick
        }
    }
}
