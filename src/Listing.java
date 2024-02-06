// Listing.java
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Listing extends Application {
    private DealershipInventory inventory = new DealershipInventory();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Car Inventory");

        ComboBox<Car> carComboBox = new ComboBox<>();
        carComboBox.getItems().addAll(inventory.getCars());

        Label inventoryCountLabel = new Label("Inventory Count: " + inventory.getTotalCars());

        Button viewDetailsButton = new Button("View Details");
        ImageView carImageView = new ImageView();
        Label carDetailsLabel = new Label();

        viewDetailsButton.setOnAction(e -> {
            Car selectedCar = carComboBox.getValue();
            if (selectedCar != null) {
                carImageView.setImage(selectedCar.getCarImage());
                carDetailsLabel.setText(selectedCar.toString());
            }
        });

        VBox vbox = new VBox(10, carComboBox, inventoryCountLabel, viewDetailsButton, carImageView, carDetailsLabel);
        vbox.setPadding(new Insets(20));

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
