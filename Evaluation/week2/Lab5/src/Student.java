public class Student {
    static int count;
    int term1;
    int term2;
    int id;
    Student()
    {
        this(0,0,0);
        id = term1 = term2 = 0;
    }
    Student(int id)
    {
        this(id,0,0);
    }
    Student(int id,int term1,int term2)
    {
        this.id = id;
        this.term1 = term1;
        this.term2 = term2;
        count++;
    }
    int get_total()
    {
        return term1 + term2;
    }
    void publish_result()
    {
        System.out.println("Id : " + id);
        System.out.println("Term 1 Result : " + term1);
        System.out.println("Term 2 Result : " + term2);
        double avg = get_total()/2.0;
        System.out.println("Average Result : " + avg);
    }
}
