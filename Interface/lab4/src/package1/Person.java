package package1;
public class Person 
{
    public String name;
    public int NID;
    public Person(String n,int id)
    {
        name = n;
        NID = id;
    }
    void canWalk()
    {
        System.out.println("A person can Walk");
    }
    void Show()
    {
        System.out.println("Name : " + name + "\n" + "NID : " + NID);
    }
    //overridding toString()
    public String toString()
    {
        //return "Name : " + name + "\n" + "NID : " + NID;
        return NID + "" + "\n";
    }
    public String getName()
    {
        return name;
    }
}
