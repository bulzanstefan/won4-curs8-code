package ro.fasttrackit.curs8.interfaces.food;

public class Company {
    private FoodProvider foodProvider;
    public Company(FoodProvider foodProvider){
        this.foodProvider = foodProvider;
    }

    public void sendFoodToEmployees(){
        System.out.println("Sending " + foodProvider.deliverFood() + " " + foodProvider.deliverQuantity());
    }
}
