public class Driver {
  public static void main(String [] args)
  {
      Student s1;
      s1 = new Student(1001,180,200);
      /*s1.id = 1001;
      s1.term1 = 180;
      s1.term2 = 200;*/
      Student s2 = new Student(1002,150,210);
      
      
      s1.publish_result();
      s2.publish_result();
      System.out.println(Student.count);
  }
}
