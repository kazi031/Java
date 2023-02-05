public class Driver {
    public static void main(String [] args)
    {
        int arr [] = {1,2,3};
        rotate(arr);
        printArray(arr);
    }
    static void rotate(int arr [])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i+1] = arr[i];
        }
        arr[0] = arr[arr.length-1];
    }
    public static void printArray(int arr [])
    {
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
