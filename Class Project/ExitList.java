import java.util.ArrayList;
/**
 * Write a description of class ExitList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitList
{
    private ArrayList<Student> exit;

    public ExitList()
    {
        exit = new ArrayList<>();
    }

    public void add(Student x)
    {
        exit.add(x);
    }

        public Student[] getCopy()
    {
        Student copy[] = new Student[exit.size()];
        copy = exit.toArray(copy);

        return copy;
    }
}
