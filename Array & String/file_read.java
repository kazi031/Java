import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class file_read
{
	public static void main(String [] args)
	{
		File f  = new File("sample.txt");
		try{
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}