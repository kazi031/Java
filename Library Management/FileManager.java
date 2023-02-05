
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;


public class FileManager {
    File f;
    FileManager(String filename)
    {
        f = new File(filename);
    }
    void printDetails()
    {
        if (f.exists())
        {
            System.out.println("Location: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length() + " byte");
        }
        else
            System.out.println("File doesn't exist");
    }
    void write(String s)
    {
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.close();
            System.out.println("Done");
        } catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
    void append(String s)
    {
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(s);
            fw.close();
            System.out.println("Done");
        } catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
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
        } catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
    void putLines(String [] args)
    {
        delete();
        for (String s : args)
            append(s + "\r\n");
    }
    
    String [] getLines(int n)
    {
        if (!f.exists()) return null;
        String args[] = new String[n];
        try
        {
        FileReader fr = new FileReader(f);
        Scanner sc = new Scanner(fr);
        int i = 0;
        while (sc.hasNext())
        {
            args[i++] = sc.nextLine();
        }
        fr.close();
        sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return args;
    }
    
    
    void printAllBuff()
    {
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null)
            {
                System.out.println(s);
                s = br.readLine();
            }
            fr.close();
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
    void printAllScanner()
    {
        try
        {
        FileReader fr = new FileReader(f);
        Scanner sc = new Scanner(fr);
        while (sc.hasNext())
        {
            String s = sc.nextLine();
            System.out.println(s);
        }
        fr.close();
        sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    void delete()
    {
        if (f.exists())
        {
            f.delete();
            System.out.println("Done");
        }
        else
            System.out.println(f.getName() + " doesn't exist.");
    }   
}
