public class Driver {
public static void main(String [] st)
{
    StudentRecords<Student> recManager = new StudentRecords<>();
    recManager.add(new Student(1, 50, 60));
    recManager.add(new FinalYearStudent(2, 40, 60, 80));
    recManager.add(new Student(3, 60, 50));
    System.out.println("Student list before sorting:");
    recManager.publishResult();
    recManager.sort();
    System.out.println("\nStudent list after sorting:");
    recManager.publishResult();
}
}