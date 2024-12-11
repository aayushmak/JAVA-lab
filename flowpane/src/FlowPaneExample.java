import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a FlowPane
        FlowPane flowPane = new FlowPane();

        // Set the horizontal and vertical gap between components
        flowPane.setHgap(10);
        flowPane.setVgap(10);

        // Add some buttons to the FlowPane
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        flowPane.getChildren().addAll(button1, button2, button3, button4, button5);

        // Set the scene and display the stage
        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setTitle("FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
