package strategy;

import java.util.ArrayList;

public class SelectionSort implements Sort {
  @Override
  public ArrayList<Integer> doSort(ArrayList<Integer> arr) {
    for (int i = 0; i < arr.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.size(); j++){
        if (arr.get(j) < arr.get(minIndex)) {
          minIndex = j;
        }
      }

      int temp = arr.get(minIndex);
      arr.set(minIndex, arr.get(i));
      arr.set(i, temp);
    }
    return arr;
  }
}