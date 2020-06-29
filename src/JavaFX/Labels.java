package JavaFX;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Labels extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Labels");

    FileInputStream input = new FileInputStream("katze.png");
    Image image = new Image(input);
    ImageView imageView = new ImageView(image);
    imageView.setFitWidth(60);
    imageView.setPreserveRatio(true);

    Label label = new Label("Hi, I am a Label with an image", imageView);

    Scene scene = new Scene(label, 400, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}

