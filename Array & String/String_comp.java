import java.util.Scanner;
public class String_comp
{
	public static void main(String [] args)
	{	
		String input;
		String password = "paad_dimu_put_put";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		if(input.equals(password))
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("Incorrect Password");
		}
	}
}