public class PrimeChecker extends Thread{
    int n;

    PrimeChecker(int a) {
        n = a;
    }
    
    void printPrime()
    {
        int flag = 1;
        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
                flag = 0;
        }
        if(flag==0)
        {
            System.out.println(n + " is not a prime");
        }
        else
        {
            System.out.println(n + " is a prime");
        }
    }
    @Override
    public void run() {
        printPrime();
    }
    
}
