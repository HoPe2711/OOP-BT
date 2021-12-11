package interfaceshape;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {

  /**
   * in hinh.
   *
   * @param shapes listShape.
   * @return string.
   */
  public String printInfo(List<GeometricObject> shapes) {
    StringBuilder ans = new StringBuilder("Circle:\n");
    for (GeometricObject object : shapes) {
      if (object instanceof Circle) {
        ans.append(object.getInfo()).append("\n");
      }
    }
    ans.append("Triangle:\n");
    for (GeometricObject object : shapes) {
      if (object instanceof Triangle) {
        ans.append(object.getInfo()).append("\n");
      }
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    List<GeometricObject> shapes = new ArrayList<>();
    shapes.add(new Circle(new Point(5, 1), 2));
    shapes.add(new Triangle(new Point(0, 1), new Point(2, 2), new Point(2, 3)));
    shapes.add(new Circle(new Point(1, 2), 3));
    ShapeUtil shapeUtil = new ShapeUtil();
    System.out.println(shapeUtil.printInfo(shapes));
  }
}
