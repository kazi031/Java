
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
    FileManager(String s){
       f = new File(s);
    }
    void Write(String s){
        try{
            FileWriter fr = new FileWriter(f);
            fr.write(s);
            fr.close();
        } 
        catch (IOException ex) 
        {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        System.out.println("Done!!");
    }
    void append(String s){
        try{
            FileWriter fr = new FileWriter(f,true);
            fr.append("\n");
            fr.append(s);
            fr.close();
        }
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        System.out.println("Done!!");
    }
    void PrintAll(){
        try {
            FileReader fr = new FileReader(f);
            int c = fr.read();
            int count = 0;
            while(c != -1)
            {
                System.out.printf("%c",c);
                c = fr.read();
                count++;
            }
            System.out.println();
            System.out.println(count);
        } 
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    void bufferScanner(){
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = br.readLine();
            }
        } 
        catch (IOException ex) {
           // Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    void PrintAllScan(){
        try {
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);
            while(sc.hasNext())
            {
                String s= sc.nextLine();
                System.out.println(s);
            }
        } 
        catch (IOException ex) {
            //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    String [] getLines(int n){
            if(!f.exists())
            {
                return null;
            }    
            String [] ret = new String[n];
            try 
            {
               FileReader  fr = new FileReader(f);
               Scanner sc = new Scanner(fr);
               int i = 0;
               while(sc.hasNext())
               {
                   String s = sc.nextLine();
                   ret[i] = s;
                   i = i + 1;
               }
            } 
            catch (IOException ex) {
                //Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);4
                ex.printStackTrace();
            }
            return ret;
    }
}
