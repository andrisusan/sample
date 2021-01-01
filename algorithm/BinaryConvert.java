import java.math.BigInteger;

/**
 * @author Andri Susanto
 */
public class BinaryConvert {

  public static void main(String[] args) {
    System.out.println(solution("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"));
    System.out.println(solution("011100"));
  }

  public static int solution(String S) {
    BigInteger value = new BigInteger(S, 2);
    int operationTotal = 0;
    while(value.compareTo(BigInteger.ZERO) > 0) {
      // check even value
      if (value.mod(new BigInteger("2")).compareTo(BigInteger.ZERO) == 0) {
        value = value.divide(new BigInteger("2"));
      } else {
        // odd value
        value = value.subtract(new BigInteger("1"));
      }
      // increase operation total
      operationTotal++;
    }
    return operationTotal;
  }


}
