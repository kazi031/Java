
import java.util.Scanner;

public class Driver {
    public static void main(String [] args)
    {
        FileManager f1 = new FileManager("AddressBook.txt");
        //f1.PrintDetails();
        //f1.delete();
        //f1.write("Kazi loves food\n");
        //f1.append("Kazi loves football\n");
        //f1.append("Kazi loves Travelling\n");
        //f1.PrintAll();
        //f1.PrintAllBuff();
        //f1.PrintAllScan();
        while(true)
        {
            System.out.println("1.Entry");
            System.out.println("2.View");
            System.out.println("3.Exit");
            int c;
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            if(c==1)
            {
                //f1.delete();
                sc.nextLine();
                System.out.print("Name : ");
                String s = sc.nextLine();
                f1.append("Name : " + s + "\n");
                String phone;
                System.out.println("Phone no. : ");
                phone = sc.nextLine();
                f1.append("Phone no. : " + phone + "\n");
                f1.append("Address : \n");
                String House_number;
                System.out.println("House no. : ");
                House_number = sc.nextLine();
                f1.append("House no. : " + House_number + "\n");
                String Street_name;
                System.out.println("Street name : ");
                Street_name = sc.nextLine();
                f1.append("Road no. : " + Street_name + "\n");
                String city;
                System.out.println("City : ");
                String City = sc.nextLine();
                f1.append("City : " + City + "\n");
               //1 City = sc.nextLine();
                        
                        
                        
            }
            else if(c==2)
            {
                f1.PrintAllScan();
            }
            else
            {
                break;
            }
        }
    }
}