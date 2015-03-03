
import java.util.ArrayList;
/**
 * Write a description of class Queue here.
 * 
 * @author (Jeff) 
 * @version (a version number or a date)
 */
public class Queue
{

    private ArrayList<Student> line1;

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        line1 = new ArrayList<Student>();
    }

    /**
     * adds a student into queue
     */
    public void enqueue(Student x)
    {
        line1.add(x);
    }

    /**
     * removes student from queue
     */
    public Student dequeue()
    {

        if(this.isEmpty() == true)
        {System.out.print("Error");
            return null;
        }
        else
        {
            return line1.remove(0);

        }
    }

    public boolean isEmpty()
    {
        return line1.isEmpty();

    }

    public int length()
    {
        return line1.size() ;
    }

    public Student getStudent(int l)
    {
        return line1.get(l);
    }


}

