import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file
{
	public static void main( String [] args)
	{
		String s1 = "I am Kazi";
		String s2 = "I am Hardworking";
		File f = new File("sample.txt");
		try{
		FileWriter fr = new FileWriter(f);
		fr.write(s1 + "\n");
		fr.write(s2 + "\n");
		fr.flush();
		fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}