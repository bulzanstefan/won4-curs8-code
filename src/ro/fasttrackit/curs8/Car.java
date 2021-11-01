package ro.fasttrackit.curs8;

public class Car {
    static int LATIME = 200;
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public static String buildMessage(){
        return "Latimea standard este " + LATIME;
    }

}
