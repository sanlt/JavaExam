package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    final StackPane stackPane = new StackPane();
    Label label = new Label("This is my first JavaFX example !!!");
    stackPane.getChildren().add(label);
    primaryStage.setScene(new Scene(stackPane, 250, 75));
    primaryStage.setTitle("Window-Title");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
