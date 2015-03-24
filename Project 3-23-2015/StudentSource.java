import java.util.Random;

/**
 * This class creates various numbers of students and enqueue them in the Queue.
 * ACT METHOD() is the only method in this class.
 * 
 * @author (Nabaraj Lamichhane)
 * upto 03-18-2015 : act () method which creates 0 student, if rand is 0. It creates 3 students, if rand is 1.
 * 03-22-2015 : edited the act() method by chaning the probability of the number of student creation.
 */

//this class implements Actor interface.
public class StudentSource implements Actor
{
    //random number generator 
    Random rgen = new Random();  

    private Queue currentQueue;

    //a two dimentional array 
    private int creationTable[][]= {{0,0},{1,0},{2,0},{3,0},{4,0},{5,5},{6,3},{7,3},{8,3},{9,1}};

    //queue entry initialization
    public StudentSource(Queue cQueue)
    {
        currentQueue = cQueue; 
    }

    // the act method which creates various number of students by probability. 
    public void act(int tick)
    {

        //generates random number from 0 to 9.
        int rand = rgen.nextInt(9);

        // numToCreate has two values: one is a random value rand and another is column one value of the created table 
        int numToCreate  = creationTable[rand][1];

        /**  the loop iterates though the array and creates various number of the students.
        50% - it does not create students, 10% - it creates 5 students, 30% - it creates 3 students and 10% it creates 1 student.*/
        for(int k=0;k<numToCreate;k++)
        {
            //enqueue the student in the currentQueue
            currentQueue.enqueue(new Student(tick));
        }

    }
}
