package JavaFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RadioButtons extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("RadioButtons");

    VBox pane = new VBox();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(10));

    final VBox box2 = new VBox();
    box2.setAlignment(Pos.CENTER_LEFT);
    box2.setPadding(new Insets(10));
    pane.getChildren().add(box2);
    
    final Text question = new Text("What color do you choose?");
    box2.getChildren().add(question);

    final ToggleGroup tg = new ToggleGroup();
    final RadioButton rb1 = new RadioButton("Red");
    rb1.setPadding(new Insets(5));
    rb1.setTextFill(Color.RED);
    rb1.setToggleGroup(tg);
    box2.getChildren().add(rb1);

    final RadioButton rb2 = new RadioButton("Blue");
    rb2.setPadding(new Insets(5));
    rb2.setTextFill(Color.BLUE);
    rb2.setToggleGroup(tg);
    box2.getChildren().add(rb2);

    final RadioButton rb3 = new RadioButton("Green");
    rb3.setPadding(new Insets(5));
    rb3.setTextFill(Color.GREEN);
    rb3.setToggleGroup(tg);
    box2.getChildren().add(rb3);

    primaryStage.setScene(new Scene(pane, 300, 200));
    primaryStage.centerOnScreen();
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }
}
