package ro.fasttrackit.curs8.interfaces.food;

public class McDonalds  implements FoodProvider{
    private int qty;

    public McDonalds(int qty){
        this.qty = qty;
    }
    @Override
    public String deliverFood() {
        return "burgers";
    }

    @Override
    public int deliverQuantity() {
        return qty;
    }
}
