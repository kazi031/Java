public class Series {
    private int n;
    Series(int n)
    {
        this.n = n;
    }
    int get_sum()
    {
        int sum = 0;
        for(int i =1;i<=n;i++)
        {
            sum += i;
        }
        return sum;
    }
}
