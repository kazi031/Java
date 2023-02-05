public class Driver {
    public static void main(String [] args)
    {
        Intermidiate s1 = new Triangle(1,2,"yellow");
        s1.getColor();
        System.out.println(s1.area());
        Intermidiate s2 = new Rectriangle(1,2,"Red");
        s2.getColor();
        System.out.println(s2.area());
    }
}
