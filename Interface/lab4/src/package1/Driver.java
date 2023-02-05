package package1;
public class Driver 
{
    public static void main(String [] args)
    {
        //System.out.print("Hello world!!");
        Person p1 = new Person("kazi",201814022);
        p1.canWalk();
        p1.Show();
        Object a;
        System.out.print(p1);
        //reference prints
        /*toString() works as Show function implicitly*/ 
        Student s1 = new Student("Kazi",201814022,14);
        System.out.print(s1);
    }
}
