package package1;
public class Student extends Person
{
    int ReadsIn;
    Student(String n,int i,int r)
    {
        super(n,i);
        ReadsIn = r;
    }
    public String toString()
    {
        return name + " " + NID + " " + ReadsIn + "\n"; 
    }
}
