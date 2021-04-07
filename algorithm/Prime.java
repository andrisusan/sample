/**
 * @author Andri Susanto
 */
public class Prime {

  public static void main(String[] args) {
    printPrimes(9);
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

}
