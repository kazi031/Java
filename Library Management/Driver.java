
import java.util.Scanner;



public class Driver {
    public static void main(String [] args)
    {
        BookList b = new BookList("booklist.csv");
        //b.printTabular();
        b.printCategory("ebook");
        
        /*FileManager f = new FileManager("AddressBook.txt");
        
        while (true)
        {
        System.out.println("1. Entry");
        System.out.println("2. View");
        System.out.println("0. Exit");
        System.out.println("Please enter a choice: ");
        
        
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1)
        {
            String params[] = new String[5];
            sc.nextLine();
            System.out.print("Name: ");
            
            params[0] = sc.nextLine();
            System.out.print("Phone Number: ");
            params[1] = sc.nextLine();
            System.out.print("House No: ");
            params[2] = sc.nextLine();
            System.out.print("Street name: ");
            params[3] = sc.nextLine();
            System.out.print("City: ");
            params[4] = sc.nextLine();
            f.putLines(params);
            sc.close();
            break;
        }
        else if (c == 2)
        {
            String [] params = f.getLines(5);
            if (params == null)
                System.out.println("No previous entry!");
            else
            {
                System.out.println("Name: " + params[0]);
                System.out.println("Phone Number: " + params[1]);
                System.out.println("House No: " + params[2]);
                System.out.println("Street name: " + params[3]);
                System.out.println("City: " + params[4]);
            }
        }
        else
        {
            break;
        }
        }*/
        
        }
        
    }   

