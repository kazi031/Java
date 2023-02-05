import java.util.Scanner;
public class Lab3
{
	static String greet(String name)
	{
		String ret = "Welcome " + name;
		return ret;
	}
	public static void main(String [] args)
	{
		String name = args[0];
		name = greet(name);
		System.out.println(name);
	}
}