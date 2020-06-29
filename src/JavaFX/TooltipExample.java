package JavaFX;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TooltipExample extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Tooltip Example");
    final GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 200, 100);
    

    Button button1 = new Button("Create");
    Tooltip tooltip = new Tooltip("Creates a new Circle");
    button1.setTooltip(tooltip);
    Circle c1 = new Circle(20.0, Color.PURPLE);
    button1.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        grid.add(c1,1,1);
      }
    });
    
    grid.add(button1,0,0); 
    primaryStage.setScene(scene);
    primaryStage.show();
    
  } 
  public static void main(String[] args) {
    Application.launch(args);
  }

}
