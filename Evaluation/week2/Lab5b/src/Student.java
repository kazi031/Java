public class Student {
    private int id;
    private int day[];
    Student(int id,int n)
    {
        this.id = id;
        day = new int[n+1];
    }
    void MarkAbsent(int i)
    {
        if(i>0 && i<day.length)
        {
            day[i] = 1;
        }
        day[0] = day[0] + 1;
    }
    void MarkPresent(int i)
    {
        if(i>0 && i<day.length)
        {
            day[i] = 0;
        }
    }
    int get_total_absent()
    {
        return day[0];
    }
    int get_total_present()
    {
        return day.length-1-day[0];
    }
    double print_attendance()
    {
        return get_total_present()/(day.length-1)*1.0;
    }
}
