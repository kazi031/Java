public class Student {
    int day;
    int [] arr ;
    Student(int n)
    {
        day = n;
        arr = new int[day];
        for(int i=0;i<n;i++)
        {
            arr[i] = 1;
        }
    }
    void Make_present(int i)
    {
        arr[i-1] = 1;
    }
    void Make_absent(int i)
    {
        arr[i-1] = 0;
    }
    double attendence_percentage()
    {
        int present = 0;
        for(int i = 0;i<day;i++)
        {
            if(arr[i] == 1)
            {
                present = present + 1;
            }
        }
        //int present = day - absent;
        System.out.println(present + " " + day);
        double attendence = (present*1.0/day);
        System.out.println(attendence);
        attendence = attendence * 100;
        return attendence;
    }
    
}
