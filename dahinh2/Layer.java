package dahinh2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Layer {

  private List<Shape> shapes = new ArrayList<>();

  public void addShape(Shape shape) {
    shapes.add(shape);
  }

  public void removeCircles() {
    shapes.removeIf(v -> v instanceof Circle);
  }

  /**
   * getinfo.
   *
   * @return info.
   */
  public String getInfo() {
    StringBuilder result = new StringBuilder("Layer of crazy shapes:\n");
    for (Shape v : shapes) {
      result.append(v.toString()).append("\n");
    }
    return result.toString();
  }

  public void removeDuplicates() {
    Set<Shape> tmp = new HashSet<>(shapes);
    shapes = new ArrayList<>(tmp);
  }

  public static void main(String[] args) {
    Layer a = new Layer();
    Shape rect1 = new Rectangle(new Point(10, 5), 8, 6, "RED", true);
    Shape rect2 = new Rectangle(new Point(10, 5), 7.99999, 6, "RED", true);
    Shape rect3 = new Rectangle(new Point(30, 5), 8, 6, "RED", true);
    Shape cir1 = new Circle(new Point(10, 5), 8, "RED", true);
    Shape cir2 = new Circle(new Point(10, 5), 8, "RED", true);
    Shape cir3 = new Circle(new Point(10, 5), 3, "RED", true);
    a.addShape(rect1);
    a.addShape(rect2);
    a.addShape(rect3);
    a.addShape(cir1);
    a.addShape(cir2);
    a.addShape(cir3);
    System.out.println(a.getInfo());
    System.out.println();
    a.removeDuplicates();
    System.out.println(a.getInfo());
    System.out.println();
    a.removeCircles();
    System.out.println(a.getInfo());
  }
}
