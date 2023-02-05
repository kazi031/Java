public class Driver {
    public static void main(String [] args)
    {
//        sum s1 = new sum(10,0);
//        try
//        {
//            double s = s1.division();
//            System.out.println(s);
//        }
//        catch(Exception e)
//        {
//             //System.out.println(e);
//            sum s2 = new sum(10,0+2);
//            System.out.println(s2.division());
//        }
//        try
//        {
//            int arr [] = {1,2,3,4};
//            System.out.println(arr[10]);
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("Rest of the code");
        try{
           int data = 10/0;
           System.out.println(data);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block is always executed");
        }
        System.out.print("Rest of the code!!");
    }
    
}