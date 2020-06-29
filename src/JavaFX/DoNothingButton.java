package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class DoNothingButton extends Application {


  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Button Demo");
    final StackPane stack = new StackPane();
    Scene scene = new Scene(stack, 200, 100);

    Button button = new Button("Do Nothing");


    stack.getChildren().addAll(button);

    primaryStage.setScene(scene);
    primaryStage.show();

  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
