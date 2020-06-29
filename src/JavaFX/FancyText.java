package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FancyText extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Labels");

    GridPane mypane = new GridPane();

    // Text with Shadow
    InnerShadow is = new InnerShadow();
    is.setOffsetX(4.0f);
    is.setOffsetY(4.0f);

    Text shadow = new Text();
    shadow.setEffect(is);
    shadow.setX(20);
    shadow.setY(100);
    shadow.setText("Shadows");
    shadow.setFill(Color.PINK);
    shadow.setFont(Font.font(null, FontWeight.BOLD, 80));
    mypane.add(shadow, 0, 0);

    // Text with Reflection
    Text t = new Text();
    t.setX(10.0f);
    t.setY(50.0f);
    t.setCache(true);
    t.setText("Reflections");
    t.setFill(Color.RED);
    t.setFont(Font.font(null, FontWeight.BOLD, 30));

    Reflection r = new Reflection();
    r.setFraction(0.7f);
    t.setEffect(r);
    mypane.add(t, 0, 1);



    Scene scene = new Scene(mypane, 450, 240, Color.AZURE);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}

