/**
 * @author Andri Susanto
 */
public class EvenNumbersOfDigits {

  public static void main(String[] args) {
    int[] arr = {555,901,482,1771};
    System.out.println(findNumbers(arr));
  }

  public static int findNumbers(int[] nums) {
    int count = 0;
    for(int i=0; i<nums.length; i++) {

      // Convert the current number to String.
      String stringNumber = String.valueOf(nums[i]);

      // Check if the length of the String is even or not.
      if(stringNumber.length() % 2 == 0) {
        count++;
      }
    }
    return count;
  }

}
