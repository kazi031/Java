import java.util.Scanner;
public class eva
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int [] set = new int [n];
		for(int i=0;i<n;i++)
		{
			set[i] = sc.nextInt();
		}
		int c = 0;
		if(set[0] > set[1])
		{
			for(int i=0;i<n-1;i++)
			{
				if(set[i] > set[i+1])
				{
					c = c + 1;
				}
			}
			if(c == n - 1)
			{
				System.out.println("The sequence is in descending Order");
			}
			else
			{
				System.out.println("The sequence is unsorted");
			}
		}
		else if(set[0] < set[1])
		{
			for(int i=0;i<n-1;i++)
			{
				if(set[i] < set[i+1])
				{
					c = c + 1;
				}
			}
			if(c == n - 1)
			{
				System.out.println("The sequence is in ascending Order");
			}
			else
			{
				System.out.println("The sequence is unsorted");
			}
		}
		
		
		
	}
}