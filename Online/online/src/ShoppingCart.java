
import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    HashMap<String,ProductInfo> h1 = new HashMap<String,ProductInfo>();
    //int count = 0;
    ArrayList<String> s1 = new ArrayList<>();
    
    void putItem(String s , ProductInfo p1){
        if(SearchItem(s)){
            ProductInfo p = h1.get(s);
            p.quantity = p.quantity + 1;
        }
        else{
            h1.put(s,p1);
            s1.add(s);
            //count = count + 1;
        }
    }
    boolean SearchItem(String s){
        return h1.containsKey(s);
    }

    void printItem(){
        for(String i : s1){
            //System.out.println(i);
            ProductInfo p = h1.get(i);
            System.out.println(i + "\t\t" + p.price + "\t\t" + p.quantity +"\t\t"+ p.get_total_price());
        }
    }
}
