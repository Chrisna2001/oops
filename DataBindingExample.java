import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage; 

public class DataBindingExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Binding Example");

        // Create a StringProperty to hold the data
        StringProperty dataProperty = new SimpleStringProperty();

        // Create UI components
        Label label = new Label("Enter Text:");
        TextField textField = new TextField();

        // Bind the text property of the TextField to the StringProperty
        textField.textProperty().bindBidirectional(dataProperty);

        // Create a layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textField);

        // Create a scene
        Scene scene = new Scene(layout, 300, 150);

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
