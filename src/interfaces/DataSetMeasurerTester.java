package interfaces;

import java.awt.Rectangle;

public class DataSetMeasurerTester {
  
  /**
   * Main method.
   * @param args unused
   */
  public static void main(String[] args) {

    // Rectangle
    Measurer m = new RectangleMeasurer();
    DataSetv2 data = new DataSetv2(m);
    data.add(new Rectangle(5, 10, 20, 25));
    data.add(new Rectangle(10, 20, 30, 40));
    Rectangle rect = (Rectangle) data.getMaximum();
    System.out.println(rect.getWidth()); // 30.0 expected
    
    // Circle
    Measurer mcirc = new CircleMeasurer();
    DataSetv2 datacircle = new DataSetv2(mcirc);
    datacircle.add(new Circle(1.0));
    datacircle.add(new Circle(2.0));
    Circle circle = (Circle) datacircle.getMaximum();
    System.out.println(circle.getArea()); 
    
  }
}

