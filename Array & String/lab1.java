import java.util.Scanner;

public class lab1
{
    /*main function*/
    public static void main(String [] args)
    {
       	/*int a = 10;*/
	while(true)
	{
		System.out.print("please enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a == -1) break;
		if(a > 0)
			System.out.println(a + " is a positive Number");
		else if(a < 0)
			System.out.println(a + " is a negative Number");
		else
 			System.out.println("The Number is zero");
	}
	
    }

}