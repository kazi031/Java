
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String [] args){
        Integer iarr[] = {10,20,30,40,50};
        Double darr[] = {11.20,12.6,13.5,2.5};
        String sarr[] = {"Mark","MaRk","mark"};
        //sortAll(sarr);
//        checkValue(iarr,20);
 //       checkValue(sarr,"mark");
        checkValue(darr,11.2);
        List<? extends Number> mixedList = Arrays.asList(5,3,2,5.5,3.2);
        List<Integer> intList = Arrays.asList(5,3,2,1);
        List<Double> doubleList = Arrays.asList(5.5,3.3,2.2,1.25);
        //UBsupportWildcard is a class which has an array list extends the classes and subclasses of Number
        UBsupportWildcard a1 = new UBsupportWildcard();
        double sum = a1.sumOfElement(mixedList);
        //System.out.println(sum + " is the sum of the mixed List");
        sum = a1.sumOfElement(intList);
        //System.out.println(sum + " is the sum of the int List");
        sum = a1.sumOfElement(doubleList);
        //System.out.println(sum + " is the sum of the double List");
        //unbounded wildcards anything you want in a list can be used
        List<?> l1 = Arrays.asList(1,2,"mark");
        a1.display(l1);
        //lower bound
        List<Number> intList1 = Arrays.asList(1,2,3,4);
        List<Number> doubleList1 = Arrays.asList(1.25,2.35,3.25,4.95);
        a1.printNumber(intList1);
        a1.printNumber(doubleList1);
    }
    //only extends the classes of Number class
    public static <T extends Number> void sortAll(T [] elem){
        Arrays.sort(elem);
        for(T i : elem)
        {
            System.out.print(i + " ");
        }
    }
    //all classes can be applied
//     public static <T> void sortAll(T [] elem){
//        Arrays.sort(elem);
//        for(T i : elem)
//        {
//            System.out.print(i + " ");
//        }
//    }
    
    public static <T> void checkValue(T [] arr,T obj)
    {
        int count = 0;
        for(T i : arr)
        {
            if(i.equals(obj))
            {
                System.out.println(i + " Was found in the array!");
                count = count + 1;
            }
        }
        if(count == 0)
        {
            System.out.println(obj + " Was not found in the array!");
        }
    }
}
