package JavaFX;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseEventExample extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("MouseEvent Example");
    final StackPane stack = new StackPane();
    Scene scene = new Scene(stack, 200, 100);
    Circle c1 =new Circle(40.0, Color.MAGENTA);
   
    Circle c2 = new Circle(20.0, Color.BLUE);
    
    c1.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        Label appear = new Label("Hello!");
        stack.getChildren().addAll(appear);
      }
    });
    
    
    c1.setOnMouseEntered(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        stack.getChildren().addAll(c2);
      }
    });
    
    c1.setOnMouseExited(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        stack.getChildren().remove(c2);
      }
    });
    
    stack.getChildren().addAll(c1);
    
    primaryStage.setScene(scene);
    primaryStage.show();
    
  } 
  
  public static void main(String[] args) {
    Application.launch(args);
  }

}
