public class Typecasting
{
	public static void main(String [] args)
	{
		String a = "25";
		String b = "30";
		System.out.println(a + "5");
		System.out.println(b + "0");
		int x = Integer.valueOf(a) + 5;
		int y = Integer.valueOf(b) + 1;
		System.out.println(x + " " + y);
	}
}