import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Name : Akshit Deswal
Student : 200454399
 */
public class Car {
    private String make, model;
    private int mileage;
    private double price;

    public Car(String make, String model, int mileage, double price) {
        setMake(make);
        setModel(model);
        setMileage(mileage);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
    List<String> validMakes = Arrays.asList("Ford", "Honda", "Porsche");
    if(validMakes.contains(make)){
        this.make = make;
    }
    else{
        throw new IllegalArgumentException(make + "is not valid, Please choose from these" + validMakes);
    }
    }

    public void setModel(String model) {
    }

    public void setMileage(int mileage) {
    }

    public void setPrice(double price) {
    }

    public String toString()
    {
        return "";
    }
}
