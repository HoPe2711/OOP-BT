package strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Context context = new Context(new SelectionSort());
    System.out.println(context.sort(new ArrayList<>(Arrays.asList(49,1,85,2,6,4,3,4))));
    context = new Context(new InsertionSort());
    System.out.println(context.sort(new ArrayList<>(Arrays.asList(5,1,3,9,74,9,1,54))));
  }
}
