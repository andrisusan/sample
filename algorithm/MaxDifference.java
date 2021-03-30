import java.util.Arrays;
import java.util.List;

/**
 * @author Andri Susanto
 */
public class MaxDifference {

  public static void main(String[] args) {
    Integer res = maxDifference(Arrays.asList(6,7,9,5,6,3,2));
    Integer res1 = maxDifference(Arrays.asList(5,10,8,7,6,5));
    System.out.println(res);
    System.out.println(res1);
  }

  public static int maxDifference(List<Integer> px) {
    // Write your code here
    Integer size = px.size() -1;
    Integer result = -1;
    for(int i=size; i>0; i--) {
      for (int j=i-1; j>=0; j--) {
        Integer count = px.get(i) - px.get(j);
        if(count > 0 && count > result )  {
          result = count;
        }
      }
    }
    return result;
  }

}
