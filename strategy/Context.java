package strategy;

import java.util.ArrayList;

public class Context {
  private Sort sort;

  public Context(Sort sort) {
    this.sort = sort;
  }

  public ArrayList<Integer> sort(ArrayList<Integer> list) {
    return sort.doSort(list);
  }
}