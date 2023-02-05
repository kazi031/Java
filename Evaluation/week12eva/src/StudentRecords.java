
import java.util.ArrayList;
import java.util.Collections;

public class StudentRecords <T>{
    ArrayList <T> records = new ArrayList<>();
    void add(T t)
    {
        records.add(t);
    }
    void publishResult(){
        System.out.println("ID" + "\t" + "Theory" + "\t" + "Lab" + "\t");
        System.out.println("-----------------------------------------");
        for(T s : records)
        {
            System.out.println(s);
        }
    }
    void sort()
    {
        Collections.sort(records, new StudentComparator());
    }
}
