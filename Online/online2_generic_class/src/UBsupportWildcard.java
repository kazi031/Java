
import java.util.List;

public class UBsupportWildcard {
    //upperbound
    public double sumOfElement(List<? extends Number> list1)
    {
        double sum = 0.0;
        for(Number num : list1)
        {
            sum = sum + num.doubleValue();
        }
        return sum;
    }
    //unbounded
    public void display(List<?> list1)
    {
        for(Object e : list1)
        {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    //lowerbound
    public void printNumber(List<? super Integer> list2)
    {
        for(Object e : list2)
        {
            System.out.print(e + " ");
        }
        System.out.println();
    }
   
}
