import java.util.Arrays;
import java.util.Scanner;

public class VampireNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      if (isVampireNumber(n)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

  public static boolean isVampireNumber(int num) {
    // Convert the number to a string
    String numStr = Integer.toString(num);
    int len = numStr.length();

    // Check if the number has an even number of digits
    if (len % 2 != 0) {
      return false;
    }

    // Split the number into two numbers with half as many digits
    int halfLen = len / 2;
    String half1 = numStr.substring(0, halfLen);
    String half2 = numStr.substring(halfLen);

    // Convert the two halves back to integers
    int num1 = Integer.parseInt(half1);
    int num2 = Integer.parseInt(half2);

    // Check if the two numbers multiply to the original number
    if (num1 * num2 != num) {
      return false;
    }

    // Check if the digits of the two numbers, in order, form a palindrome
    char[] digits = (half1 + half2).toCharArray();
    Arrays.sort(digits);
    return new String(digits).equals(numStr);
  }
}
