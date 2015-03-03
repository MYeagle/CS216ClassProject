
/**
 * Station
 *    add summary of class:
 *  
 *  changes: 
 * 2015 02 19 pm Sal version 
 * 2015 02 22 16:05 sbw merged and edited 
 */
public class Station implements Actor
{
    // instance variables - replace the example below with your own
    // My station number (0...3 = offset into Student)
    //  q0_ref, q1_ref...  refs to all the queuea
    //--current student ref

    private Student currentStudent; // To keep track of the current student
	private int myId;  //id of this Station
    private Queue [] refs;  //has refs to the queues 
     	
    
     public Station(int id, Queue ref0, Queue ref1, Queue ref2, Queue ref3, Queue qx)
    {
	     
	     refs = new Queue[4];
	     refs[0] = new Queue();  //registration
       
         currentStudent = null; //make the student empty
    }
    
    public void act (int tick)
    {
        if(currentStudent == null) 
        {
            currentStudent = refs[0].dequeue();
              // adds a student if currentStudent is empty 			  
              //must check for null -> none in line... no further act this tick
			     // end if null
			  //	currentStundent non-null, process continues		
			       //update entry time field in student
			  
                //???? sal's: tick has to be finished -- i think this is a different step (below)
             
        }
        else
        {
		    //check for currentStudent at exit tick (start + duration)
			   // --  process as needed  [nothing designed so far]
			   // enqueue currentStudent to some exitQ or just  add to exitList
			   // set currentStudent to null
            
        }
    }
}
