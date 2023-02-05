public class Driver {
    public static void main(String [] args)
    {
        Student s1 = new Student(10);
        s1.Make_absent(5);
        s1.Make_absent(8);
        System.out.println(s1.attendence_percentage()+ "%");
    }
}
