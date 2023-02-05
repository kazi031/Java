import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
	protected File f;
	
	FileManager(String filename)
	{
		f = new File(filename);
	}
	
	
	
	void printDetails()
	{
		System.out.println("File: " + f.getAbsolutePath());
		System.out.println("Size: " + f.length() + " bytes");
	}
	void delete()
	{
		if (f.exists() && f.isFile())
		{
			f.delete();
			System.out.println(f.getName() + " deleted");
		}
		else
			System.out.println(f.getName() + " doesn't exist or not a file");		
	}
	

	void write(String s)
	{
		try {
			FileWriter fr = new FileWriter(f);
			
			fr.write(s);
			
			
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
		
	}
	void append(String s)
	{
		try {
			FileWriter fr = new FileWriter(f, true);
			fr.append(s);
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}
	
	void printAll()
	{
		try {
			FileReader fr = new FileReader(f);
			int c = fr.read();
			while (c != -1)
			{
				System.out.printf("%c", c);
				c = fr.read();
			}
				
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void printAllBuff()
	{
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while(s != null)
			{
				System.out.println(s);
				s = br.readLine();
			}
				
			br.close();
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void printAllScan()
	{
		FileReader fr;
		try {
			fr = new FileReader(f);
			Scanner sc = new Scanner(fr);
			while(sc.hasNext())
			{
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
