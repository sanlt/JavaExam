package interfaces;

/*
 * CircleMeasurer implements specific callback for Circles.
 * It implements the Measurer interface.
 */
public class CircleMeasurer implements Measurer {
  
  @Override
  public double measure(Object obj) {
    Circle circle = (Circle) obj; // cast is necessary, because we get Objects
    return circle.getArea();
  }

}
