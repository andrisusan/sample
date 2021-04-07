import java.util.HashSet;

/**
 * @author Andri Susanto
 */
public class Pairs {

  public static void main(String[] args) {
    int A[] = { 1, 4, 45, 6, 10, -8 };
    int n = 16;
    printPairs(A, n);
  }


  public static void printPairs(int arr[], int k) {
    HashSet<Integer> s = new HashSet<>();
    for (int i = 0; i < arr.length; ++i) {
      int temp = k - arr[i];
      if (s.contains(temp)) {
        System.out.println("Pair with given sum " + k + " is (" + arr[i] + ", " + temp + ")");
      }
      s.add(arr[i]);
    }
  }

}
