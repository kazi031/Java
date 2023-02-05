
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    protected File f;
    FileManager(String filename)
    {
        f = new File(filename);
    }
    void PrintDetails()
    {
        System.out.println("File : " + f.getAbsolutePath());
        System.out.println("Size : " + f.length() + " bytes");
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println(f.getName());
    }
    void delete()
    {
        if(f.exists() && f.isFile())
        {
            f.delete();
            System.out.println(f.getName() + " has been deleted");
        }
        else
        {
            System.out.println(f.getName() + " doesn't exist");
        }
    }
    void write(String s)
    {
        try 
        {
            FileWriter fr = new FileWriter(f);
            fr.write(s);
            fr.close();
            System.out.println("Done");
        }
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    void append(String s)
    {
        try 
        {
            FileWriter fr = new FileWriter(f,true);
            fr.write(s);
            fr.close();
            System.out.println("Done");
        } 
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    void PrintAll()
    {
        try {
            FileReader fr = new FileReader(f);
            int c = fr.read();
            while(c != -1)
            {
                System.out.printf("%c",c);
                c = fr.read();
            }
            fr.close();
        } 
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    void PrintAllBuff()
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
        }
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    void PrintAllScan()
    {
        try
        {
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
            while(sc.hasNext())
            {
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
            fr.close();
        } 
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    String [] getLines(int n)
    {
        if(!f.exists())
        {
            return null;
        }
        String [] args = new String[n];
        try 
        {
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
            int i = 0;
            while(sc.hasNext())
            {
                args[i++] = sc.nextLine();
            }
            fr.close();
            sc.close();
        } 
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return args;
    }
}
