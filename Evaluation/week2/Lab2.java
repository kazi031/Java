import java.util.Scanner;
public class Lab2
{
	public static void main(String [] args)
	{
		String password = "1234";
		String input = args[0];
		System.out.print("Please enter your password : ");
		/*Scanner sc = new Scanner(System.in);
		input = sc.nextLine();*/
		if(password.equals(input))
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("Incorrect Password");
		}
	
	}
}