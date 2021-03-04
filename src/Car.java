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
        List<String> fordModels = Arrays.asList("F150","Escort","Explorer");
        List<String> hondaModels = Arrays.asList("Accord","Civic","Pilot");
        List<String> porscheModels = Arrays.asList("911", "Cayman", "718 Boxster");
        if(make.equals("Ford") && fordModels.contains(model)){
            this.model = model;
        }
        else if(make.equals("Honda") && hondaModels.contains(model)){
            this.model = model;
        }
        else if(make.equals("Porsche") && porscheModels.contains(model)){
            this.model = model;
        }
        else{
            throw new IllegalArgumentException("Entry is not valid");
        }
    }

    public void setMileage(int mileage) {
        if(mileage >= 0 && mileage <= 5000000) {
            this.mileage = mileage;
        }
        else{
            throw  new IllegalArgumentException(mileage +" is not valid, please enter mileage between 0 to 5 million.");
        }
    }

    public void setPrice(double price) {
    }

    public String toString()
    {
        return "";
    }
}
