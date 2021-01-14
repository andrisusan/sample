import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Andri Susanto
 */
public class Sorting {

  public static void main(String[] args) {

    System.out.println("result " + Arrays.toString(minimumSwaps(new int[]{2, 3, 0, 1})));
    System.out.println("result " + Arrays.toString(minimumSwaps(new int[]{1, 0, 3, 2})));

    System.out.println("result " + Arrays.toString(sortSwapZero(new int[]{1, 0, 3, 2})));
    System.out.println("result " + Arrays.toString(sortSwapZero(new int[]{2, 3, 0, 1})));
    System.out.println("result " + Arrays.toString(sortSwapZero(new int[]{2, 3, 1, 0})));
    System.out.println("result " + Arrays.toString(sortSwapZero(new int[]{5, 3, 1, 2, 8, 7, 6, 4, 0})));
  }

  static Map<Integer, Integer> toMapByValue(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i< arr.length; i++) {
      map.put(arr[i], i);
    }
    return map;
  }

  /**
   * This is O(N2)
   * @param arr integer of array input
   * @return result of sorting
   */
  static int[] sortSwapZero(int[] arr) { // 2 3 0 1
    Map<Integer, Integer> map = toMapByValue(arr);
    for (int i=1; i< arr.length; i++) {
      int tempIndex = map.get(0); // index of value zero
      // swap zero to current index
      int tempValue = arr[i];
      arr[i] = arr[tempIndex];
      arr[tempIndex] = tempValue; // 2 0 3 1

      // update map
      map = toMapByValue(arr);

      // swap current index to correct value
      int indexI = map.get(i);
      int temp = arr[indexI];
      arr[indexI] = arr[i];
      arr[i] = temp; // 2 1 3 0

      // update map
      map = toMapByValue(arr);
    }
    return arr;
  }

  /**
   * This is O(N)
   * @param arr integer of array input
   * @return result of sorting
   */
  static int[] minimumSwaps(int[] arr) {
    Map<Integer, Integer> byIndex = new HashMap<>();
    Map<Integer, Integer> byValue = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      byValue.put(arr[i], i);
      byIndex.put(i, arr[i]);
    }
    for (int i = 1; i < arr.length; i++) {
      int tempIndex = byValue.get(0); //2
      int tempValue = arr[i];

      //swap zero to index
      arr[i] = arr[tempIndex];
      byValue.put(arr[i], i);
      byIndex.put(i, arr[i]);
      arr[tempIndex] = tempValue;
      byValue.put(tempValue, tempIndex);
      byIndex.put(tempIndex, tempValue);

      //do operation swap correct number
      int temps = arr[i]; //0
      arr[i] = byIndex.get(byValue.get(i));
      arr[byValue.get(arr[i])] = temps;
      byValue.put(0, byValue.get(i));
      byIndex.put(byValue.get(i), 0);
      byValue.put(arr[i], i);
      byIndex.put(i, arr[i]);
      System.out.println();
    }
    return arr;
  }

}
