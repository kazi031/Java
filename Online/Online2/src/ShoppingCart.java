
import java.util.HashMap;

public class ShoppingCart {
    HashMap<String,ProductInfo> h1 = new HashMap<String,ProductInfo>();
    
    void putItem(String s , ProductInfo p1){
        if(SearchItem(s)){
            ProductInfo p = h1.get(s);
            p.quantity = p.quantity + 1;
        }
        else{
            h1.put(s,p1);
        }
    }
    boolean SearchItem(String s){
        return h1.containsKey(s);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "h1=" + h1 + '}';
    }
    
}
