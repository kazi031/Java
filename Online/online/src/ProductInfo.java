public class ProductInfo {
    int price;
    int quantity;

    public ProductInfo(int price) {
        this.price = price;
        quantity = 1;
    }
    int get_total_price(){
        return price*quantity;
    }
}
