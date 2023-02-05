
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver {
    public static void main(String [] args) 
    {
        //printPrime(13);
        
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter a number :");
//        int x = sc.nextInt();
//        PrimeChecker obj1 = new PrimeChecker(x);
//        obj1.start();     //fork
//        System.out.print("Please enter another number :");
//        int y = sc.nextInt();
//        PrimeChecker obj2 = new PrimeChecker(y);
//        obj2.start();
        
       /* try {
            obj1.join();
            System.out.println("Thread 1 finished!");
            obj2.join();
            System.out.println("Thread 2 finished!");
        } catch (InterruptedException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }*/
//        try{
//        Thread.sleep(2000);
//        }
//        catch(InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println("End of main thread!");
        new StringChecker("hello").start();
        new StringChecker ("World").start();
    }
    static synchronized void stringPrinter(String s)
    {
        for(int i =0 ;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
