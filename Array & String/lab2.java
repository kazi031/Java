import java.util.Scanner;

/*public class lab2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String name,name1;
		System.out.print("Please enter a name : ");
		name = sc.nextLine();
		System.out.print("Please enter another name : ");
		name1 = sc.nextLine();
		String greetings = "Hello ";
		String greetings2 = "Welcome ";
		//System.out.println(greetings + name);
		System.out.println(name.length() + " " + name1.length());
	}
}
public class lab2
{
	public static void main(String [] args)
	{
		int arr[] = new int[5];
		System.out.println("Length of the array " + arr.length);
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//for(int i = 0;i < 5 ; i++)
		for(int p : arr)
		{
			System.out.print(p + " ");
		}
		//index missing for-each loop...//
	}	
}*/

public class lab2
{
	public static void main(String [] args)
	{
		System.out.println(args.length);
		for(String s : args)
		{
			System.out.println(s);
		}
	}
}









