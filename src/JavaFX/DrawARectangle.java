package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawARectangle extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    // Add a StackPane on which we will draw the Rectangle
    final StackPane stack = new StackPane();
    Rectangle r1 = new Rectangle(200, 200, Color.BLUE);

    final Scene scene = new Scene(stack, 300, 250);
    primaryStage.setTitle("Blue Rectangle");
    primaryStage.setScene(scene);
    stack.getChildren().addAll(r1);
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}

