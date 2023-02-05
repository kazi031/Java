import java.util.Scanner;
public class practice
{
     public static void main(String [] args)
     {
	//int a = 10;
	int roll;
	float gpa;
	String name;
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter name : ");
	name = sc.nextLine();
	System.out.print("Enter roll : ");
	roll = sc.nextInt();
	System.out.print("Enter CGPA : ");
	gpa = sc.nextFloat();
	System.out.print("Name :" + name + "\n" + "Roll :" + roll + "\n" + "CGPA :" + gpa);
     }
	
}