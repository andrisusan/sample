import java.util.Arrays;

/**
 * @author Andri Susanto
 */
public class DuplicateZero {

  public static void main(String[] args) {
    int[] arr = {1,0,2,3,0,4,5,0};
//    int[] arr = {0,0,0,0,0,0,0};
    System.out.println(Arrays.toString(duplicateZeros(arr)));
  }

  public static int[] duplicateZeros(int[] arr) {

    int[] result = new int[arr.length];
    int lastIndex = 0;

    for (int i = 0; i < arr.length; i++) {
      if (lastIndex == arr.length) {
        break;
      }
      if (arr[i] == 0) {
        result[lastIndex] = arr[i];
        if (lastIndex == arr.length-1) {
          break;
        }
        result[lastIndex + 1] = arr[i];
        lastIndex++;
      }
      result[lastIndex] = arr[i];
      lastIndex++;
    }

    for (int i = 0; i < result.length; i++) {
      arr[i] = result[i];
    }

    return result;

  }

}
