package strategy;

import java.util.ArrayList;

public class InsertionSort implements Sort {
  @Override
  public ArrayList<Integer> doSort(ArrayList<Integer> arr) {
    for (int i = 1; i < arr.size(); ++i) {
      int key = arr.get(i);
      int j = i - 1;
      while (j >= 0 && arr.get(j) > key) {
        arr.set(j + 1, arr.get(j));
        j = j - 1;
      }
      arr.set(j + 1, key);
    }
    return arr;
  }
}