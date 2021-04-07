/**
 * @author Andri Susanto
 */
public class Palindrome {

  public static void main(String[] args) {
    String palindrome = "AKA";
    String notPalindrome = "AKK";

    System.out.println(isPalindrome(palindrome));
    System.out.println(isPalindrome(notPalindrome));
  }

  public static boolean isPalindrome(String input) {
    int i = 0, j = input.length() - 1;
    while (i < j) {
      if (input.charAt(i) != input.charAt(j))
        return false;
      i++;
      j--;
    }
    return true;
  }

}
