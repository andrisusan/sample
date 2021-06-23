/**
 * @author Andri Susanto
 */
public class Prime {

  public static void main(String[] args) {
    printPrimes(9);

    System.out.println();

    int[] arr = {1,2,3,4,5};
    findPrimes(arr);
  }

  public static void printPrimes(Integer totalPrime) {
    int count = 0, n = 0, i = 1, j = 1;
    while (n < totalPrime) {
      j = 1;
      count = 0;
      while (j <= i) {
        if (i % j == 0) {
          count++;
        }
        j++;
      }
      if (count == 2) {
        System.out.printf("%d ", i);
        n++;
      }
      i++;
    }
  }

  public static void findPrimes(int[] arr) {
    for (int value : arr) {
      int j = 1, count = 0;
      while (j <= value) {
        if (value % j == 0) {
          count++;
        }
        j++;
      }
      if (count == 2) {
        System.out.printf("%d ", value);
      }
    }
  }

}
