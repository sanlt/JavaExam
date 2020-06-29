package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LayoutPanes extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    // set title for Window (stage)
    primaryStage.setTitle("Layout Panes");

    // Create the BorderPane
    BorderPane border = new BorderPane();
    // Create a HBox and set it for the top part of the BorderPane
    HBox hbox = addHBox();
    border.setTop(hbox);
    // Create a VBox and set it for the left part of the BorderPane
    border.setLeft(addVBox());
    // Add StackPane to HBox in top region
    addStackPane(hbox);

    // Add the GridPane; add an AnchorPane to it
    GridPane mygrid = addGridPane();
    AnchorPane myanchor = addAnchorPane(mygrid);
    // Set the GridPane with AnchorPane to the center of the BorderPane
    border.setCenter(myanchor);

    // Add BorderPane to the Scene, connect the Scene to the Stage and make it visible
    Scene scene = new Scene(border, 600, 550);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /* Returns an AnchorPane including a given GridPane */
  public AnchorPane addAnchorPane(GridPane grid) {
    //Create AnchorPane
    AnchorPane anchorpane = new AnchorPane();
    //Create two Buttons
    Button buttonSave = new Button("Save");
    Button buttonCancel = new Button("Cancel");

    //Group Buttons on a HBox
    HBox hb = new HBox();
    hb.setPadding(new Insets(0, 10, 10, 10));
    hb.setSpacing(10);
    hb.getChildren().addAll(buttonSave, buttonCancel);

    //Add given GridPane and HBox with Buttons on the AnchorPane
    anchorpane.getChildren().addAll(grid, hb);
    AnchorPane.setBottomAnchor(hb, 8.0);
    AnchorPane.setRightAnchor(hb, 5.0);
    AnchorPane.setTopAnchor(grid, 10.0);
    
    //Return the AnchorPane
    return anchorpane;
  }

  // Returns a HBox
  public HBox addHBox() {
    // Create HBox and set Padding, Spacing and Background Color
    HBox hbox = new HBox();
    hbox.setPadding(new Insets(15, 12, 15, 12));
    hbox.setSpacing(10);
    hbox.setStyle("-fx-background-color: #336699;");

    //Create two buttons and add them to the HBox
    Button buttonCurrent = new Button("Add Circle");
    buttonCurrent.setPrefSize(100, 20);
    Button buttonProjected = new Button("Add Rectangle");
    buttonProjected.setPrefSize(130, 20);
    hbox.getChildren().addAll(buttonCurrent, buttonProjected);
    // Return the HBox
    return hbox;
  }

  // Returns a VBox
  public VBox addVBox() {
    //Create a VBox, set Padding and Spacing
    VBox vbox = new VBox();
    vbox.setPadding(new Insets(10));
    vbox.setSpacing(8);

    //Create a Text and add it to the VBox
    Text title = new Text("Data");
    title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
    vbox.getChildren().add(title);

    // Create a list of Hyperlinks and add it to the VBox
    // for now, nothing happens! We need to handle the click-Event
    Hyperlink options[] = new Hyperlink[] {new Hyperlink("Rectangles"), new Hyperlink("Circles"),
        new Hyperlink("Triangles")};

    for (int i = 0; i < 3; i++) {
      VBox.setMargin(options[i], new Insets(0, 0, 0, 8));
      vbox.getChildren().add(options[i]);
    }

    // Return the VBox
    return vbox;
  }

  // Add a StackPane with a Help Button to the existing HBox
  public void addStackPane(HBox hb) {
    //Create the StackPane
    StackPane stack = new StackPane();
    // Create a Rectangle as a help icon and format it
    Rectangle helpIcon = new Rectangle(30.0, 25.0);
    helpIcon.setFill(new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE,
        new Stop[] {new Stop(0, Color.web("#4977A3")), new Stop(0.5, Color.web("#B0C6DA")),
            new Stop(1, Color.web("#9CB6CF")),}));
    helpIcon.setStroke(Color.web("#D0E6FA"));
    helpIcon.setArcHeight(3.5);
    helpIcon.setArcWidth(3.5);

    // Create the text on the help icon and format it
    Text helpText = new Text("?");
    helpText.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
    helpText.setFill(Color.WHITE);
    helpText.setStroke(Color.web("#7080A0"));

    // Add Text and Image to the StackPane and align it
    stack.getChildren().addAll(helpIcon, helpText);
    stack.setAlignment(Pos.CENTER_RIGHT); // Right-justify nodes in stack
    StackPane.setMargin(helpText, new Insets(0, 10, 0, 0)); // Center "?"

    // Add the StackPane to the existing HBox
    hb.getChildren().add(stack);
    HBox.setHgrow(stack, Priority.ALWAYS); // Give stack any extra space
  }

  // Returns a GridPane
  public GridPane addGridPane() {
    // Create a GridPane and position it
    GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(0, 10, 0, 10));

    // "Example" in column 2, row 1
    Text category = new Text("Example:");
    category.setFont(Font.font("Arial", FontWeight.BOLD, 20));
    grid.add(category, 1, 0);

    // Title in column 3, row 1
    Text chartTitle = new Text("Layout Panes");
    chartTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
    grid.add(chartTitle, 2, 0);

    // Subtitle in columns 2-3, row 2
    Text chartSubtitle = new Text("Circles and Squares");
    grid.add(chartSubtitle, 1, 1, 2, 1);

    // Circle in column 1, rows 1-2
    Circle c1 = new Circle(20.0, Color.PURPLE);
    grid.add(c1, 0, 0, 1, 2);

    // Rectangle in columns 2-3, row 3
    Rectangle r1 = new Rectangle(40, 20, Color.PINK);
    grid.add(r1, 1, 2, 2, 1);

    return grid;
  }

  // Main method to launch the program
  public static void main(String[] args) {
    Application.launch(args);
  }
}

