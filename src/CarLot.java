import java.util.ArrayList;

public class CarLot {
    private ArrayList<Car> cars;

    public CarLot(){
        cars = new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public double getInventoryValue()
    {
        double price = 0;
        for (Car car:cars)
        {
            price = price + car.getPrice();
        }
        return price;
    }

    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        ArrayList<Car> allCars = new ArrayList<>();
        if(allCars.size() == 0){
            return (ArrayList<Car>) allCars;
        }
        for (Car car:cars)
        {
            if(car.getMake().equals(manufacturer))
            {
                allCars.add(car);
            }
//            else if(!(car.getMake().equals(manufacturer)))
//            {
//                return (ArrayList<Car>) allCars;
//            }
            //allCars.addAll(car.getMake());
        }
        return allCars;
    }

    public ArrayList<Car> getCarsByModel(String model)
    {

        return null;
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        return null;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        return -1;
    }

    public double getAvgPrice()
    {
        return -1;
    }

    public int getNumOfCarsInInventory()
    {
        return -1;
    }

    public String toString()
    {
        return "";
    }
}
