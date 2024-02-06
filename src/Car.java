// Car.java
import javafx.scene.image.Image;

public class Car {
    private int year;
    private String make;
    private String model;
    private String vin;
    private int mileage;
    private double cost;
    private boolean cleanRecord;
    private Image carImage;

    public Car(int year, String make, String model, String vin, int mileage, double cost, boolean cleanRecord, Image carImage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.mileage = mileage;
        this.cost = cost;
        this.cleanRecord = cleanRecord;
        this.carImage = carImage;
    }

    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getVin() {
        return vin;
    }
    public int getMileage() {
        return mileage;
    }
    public double getCost() {
        return cost;
    }
    public boolean isCleanRecord() {
        return cleanRecord;
    }
    public Image getCarImage() {
        return carImage;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model + "\n" +
                "VIN: " + vin + "\n" +
                "Mileage: " + mileage + " miles\n" +
                "Cost: $" + cost + "\n" +
                "Clean Record: " + (cleanRecord ? "Yes" : "No");
    }
}