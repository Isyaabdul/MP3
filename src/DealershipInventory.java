// DealershipInventory.java
import javafx.scene.image.Image;
import java.util.ArrayList;

public class DealershipInventory {
    private ArrayList<Car> cars;

    public DealershipInventory() {
        cars = new ArrayList<>();
        cars.add(new Car(2020, "Toyota", "Camry", "4T1B11HK4JU508743", 15000, 25000.00, true, new Image("Images/toyota_camry.png")));
        cars.add(new Car(2019, "Honda", "Civic", "2HGFC2F59KH565160", 20000, 20000.00, false, new Image("Images/honda_civic.jpg")));
        cars.add(new Car(2018, "Ford", "Fusion", "3FA6P0HD8JR111395", 30000, 18000.00, true, new Image("Images/ford_fusion.jpg")));
        cars.add(new Car(2017, "Nissan", "Altima", "1N4AL3AP3HC233519", 40000, 15000.00, false, new Image("Images/nissan_altima.jpg")));
    }

    public int getTotalCars() {
        return cars.size();
    }
    public Car getCar(int index) {
        return cars.get(index);
    }
    public ArrayList<Car> getCars() {
        return cars;
    }
}
