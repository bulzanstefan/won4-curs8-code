package ro.fasttrackit.curs8.interfaces.food;

public class Kfc implements FoodProvider {
    private McDonalds mcDonalds;

    public Kfc(int qty) {
        mcDonalds = new McDonalds(qty + 1);
    }

    @Override
    public String deliverFood() {
        return "KFC: " + mcDonalds.deliverFood();
    }

    @Override
    public int deliverQuantity() {
        return mcDonalds.deliverQuantity() - 1;
    }
}
