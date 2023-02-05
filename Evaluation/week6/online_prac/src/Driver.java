import java.util.Scanner;
public class Driver
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int[3][3];
        int arr1 [][] = new int[3][3];
        int arr2 [][] = new int[3][3];
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
        for(int i=0;i<arr[0].length;i++)
        {
            int c = 0;
            for(int j = 0;j<arr[i].length;j++)
            {
                int total = 0;
                
                for(int k=0;k<arr[i].length;k++)
                {
                    total = total + arr[i][k] * arr1[k][j];
                    
                }
                arr2[i][j] = total;
            }
        }
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
    
    
   }
}


