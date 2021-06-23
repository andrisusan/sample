/**
 * @author Andri Susanto
 */
public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    int[] arr = {0,1,1,1,0,1,1};
    System.out.println(findMaxConsecutiveOnes(arr));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int indexZero = -1;
    int lengthResult = 0;
    for (int i=0; i< nums.length; i++) {
      if(nums[i] == 0) {
        indexZero = i;
        continue;
      }

      int length = i-indexZero;
      if (length > lengthResult) {
        lengthResult = length;
      }
    }
    return lengthResult;
  }

}
