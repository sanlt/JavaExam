package JavaFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Checkboxes extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {

    VBox pane = new VBox();
    pane.setAlignment(Pos.CENTER_LEFT);
    pane.setPadding(new Insets(10));

    final Text question = new Text("Choose one or more fruits");
    pane.getChildren().add(question);

    final HBox box1 = new HBox();
    box1.setAlignment(Pos.CENTER_LEFT);
    box1.setPadding(new Insets(10));
    pane.getChildren().add(box1);

    final CheckBox cb1 = new CheckBox("Apple ");
    box1.getChildren().add(cb1);

    final CheckBox cb2 = new CheckBox("Pear  ");
    box1.getChildren().add(cb2);

    final CheckBox cb3 = new CheckBox("Banana");
    box1.getChildren().add(cb3);

    primaryStage.setScene(new Scene(pane, 300, 200));
    primaryStage.centerOnScreen();
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
