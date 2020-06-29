package JavaFX;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyPressedExample extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("KeyPressed Example");
    final StackPane stack = new StackPane();
    Scene scene = new Scene(stack, 200, 100);

    TextField field = new TextField();
    field.setPromptText("Write here:");
    Text whatkey = new Text();

    field.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent event) {
        whatkey.setText("\n \n \n You are pressing: " + event.getText());
        stack.getChildren().addAll(whatkey);
      }
    });
    field.setOnKeyReleased(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent event) {
        stack.getChildren().remove(whatkey);
      }
    });
    stack.getChildren().addAll(field);
    primaryStage.setScene(scene);
    primaryStage.show();

  }

  public static void main(String[] args) {
    Application.launch(args);
  }

}
