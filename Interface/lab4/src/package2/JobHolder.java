package package2;

//import package1.*;//means everything

import package1.Person;


public class JobHolder extends Person{
    public JobHolder(String n,int i)
    {
        super(n,i);
    }
    public String toString()
    {
        return name; 
    }
}
