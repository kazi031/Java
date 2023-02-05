
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    protected File f;
    FileManager(String filename)
    {
        f = new File(filename);
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
            while(sc.hasNext() && i!=n)
            {
                //System.out.println(i);
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
