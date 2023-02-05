import java.util.Scanner;
public class Driver
{
    public static void main(String [] args)
    {
//        int [] arr = {1,3,5,7,9};
//        printArray(arr);
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int[3][3];
        int arr1 [][] = new int[3][3];
        int arr2 [][] = new int[3][3];
//        arr[0] = new int[4];
//        arr[1] = new int[3];
//        arr[2] = new int[2];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                int count = 0;
                for(int k =0;k<arr2[j].length;k++)
                {
                  count = count + arr[i][j]*arr1[k][j]; 
                }
                arr2[i][j] = count;
            }
        }
        printArray(arr2);
    }
    public static void printArray(int arr [][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {    
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}
