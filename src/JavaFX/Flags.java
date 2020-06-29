package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Flags extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    // Create the BorderPane
    BorderPane border = new BorderPane();
    // On the top, write a title in  HBox
    HBox tophbox = new HBox();
    tophbox.setPadding(new Insets(15, 12, 15, 12));
    tophbox.setSpacing(10);
    tophbox.setStyle("-fx-background-color: #336699;");
    // On the left, put buttons
    VBox left = new VBox();
    left.setPadding(new Insets(10));
    left.setSpacing(8);
    // In the center, draw a flag
    StackPane flag = new StackPane();
    
    // Top
    Text title = new Text("Flags with Layout Panes");
    title.setFont(Font.font("Verdana", 18));
    title.setFill(Color.WHITE);
    tophbox.getChildren().add(title);
    border.setTop(tophbox);
    
    // Left
    Button flagbutton = new Button("Switzerland");
    Button flagbuttonJP = new Button("Japan");
    left.getChildren().add(flagbutton);
    left.getChildren().add(flagbuttonJP);
    border.setLeft(left);
    
    // Center
    Rectangle r1 = new Rectangle(200, 200, Color.RED);
    Rectangle r2 = new Rectangle(120, 36, Color.WHITE);
    Rectangle r3 = new Rectangle(36, 120, Color.WHITE);
    flag.getChildren().addAll(r1,r2,r3);
    border.setCenter(flag);
    
    // Add BorderPane to the Scene, connect the Scene to the Stage and make it visible
    Scene scene = new Scene(border, 600, 550);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  // Main method to launch the program
  public static void main(String[] args) {
    Application.launch(args);
  }

}

