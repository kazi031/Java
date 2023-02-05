public class Lab4
{
	static void modify(int [] a)
	{
		a[0] = 0;
	}
	public static void main(String [] args)
	{
		int [] arr2 = {1,2,3,4};
		modify(arr2);
		for(int val : arr2)
		{
			System.out.print(val + " ");
		}
	}
}
		