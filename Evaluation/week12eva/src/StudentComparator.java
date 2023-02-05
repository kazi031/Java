
import java.util.Comparator;

public class StudentComparator<T> implements Comparator<Student>{

    @Override
    public int compare(Student t, Student t1) {
        if(t.getTotalMarks() > t1.getTotalMarks())
        {
            return -1;
        }
        else if(t.getTotalMarks() < t1.getTotalMarks())
        {
            return 1;
        }
        else{
            if(t.theoryMarks > t1.theoryMarks)
            {
                return -1;
            }
            else 
                return 1;
        }
    }
    
}
