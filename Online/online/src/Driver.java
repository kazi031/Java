public class Driver {
    public static void main(String[] args) {
        //System.out.println("Hello World!!");
        ShoppingCart s1 = new ShoppingCart();
        s1.putItem("oil",new ProductInfo(100));
        s1.putItem("oil",new ProductInfo(100));
        s1.putItem("Sugar",new ProductInfo(80));
        s1.putItem("Sugar",new ProductInfo(80));
        s1.putItem("Sugar",new ProductInfo(80));
        //System.out.println(s1);
        s1.printItem();
}
}
