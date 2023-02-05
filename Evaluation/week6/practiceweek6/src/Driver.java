import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver
{
    public static void main(String [] args)
    {
        String name = null;
        int roll = 0 ;
        Scanner sc = new Scanner(System.in);
        try{
        
            System.out.print("Please Enter your Name : ");
            name = sc.nextLine();
            System.out.print("Please Enter your Roll : ");
            roll = sc.nextInt();
            if(roll<0)
            {
                roll = 5/0;
            }
            if(name.length()<=3)
            {
                System.out.println(25/0);;
            }
        }
        catch(ArithmeticException p)
        {
            if(name.length()<=3)
            {
                System.out.println("Name is too short");
                name = "Akib";
                System.out.println("You have been assigned the name "+name);
            }
            if(roll<0)
            {
                System.out.println("Roll number can't be negative");
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Your roll Must be an integer!");
        }
        finally
        {
            System.out.println(name + " Welcome to MIST");
        }
    }
}
