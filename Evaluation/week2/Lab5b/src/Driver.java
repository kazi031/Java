public class Driver {
    public static void main(String [] args)
    {
        Student s1 = new Student(1001,10);
        s1.MarkAbsent(2);
        s1.MarkAbsent(8);
        s1.MarkAbsent(3);
        System.out.println(s1.print_attendance());
    }
}
