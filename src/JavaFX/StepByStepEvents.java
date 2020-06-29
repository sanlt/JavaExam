package JavaFX;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StepByStepEvents extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Step by Step Exercise");
    final GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 420, 250);
    
    Label label1 = new Label("Press c for Circle and r for Rectangle!");
    label1.setFont(Font.font("Verdana", 16));
    grid.add(label1, 0, 0, 2, 1);
    
    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
      public void handle(KeyEvent event) {
        if (event.getText().equals("r")){
          Rectangle r1 = new Rectangle(50,50, Color.color(Math.random(),Math.random(),Math.random())); 
          grid.add(r1, 1, 1);
        }
        if (event.getText().equals("c")) {
          Circle c1 =new Circle(40.0, Color.color(Math.random(),Math.random(),Math.random()));
          grid.add(c1,2,2);
        }
      }
    });
    
    primaryStage.setScene(scene);
    primaryStage.show();
    
  } 
  public static void main(String[] args) {
    Application.launch(args);
  }

}
