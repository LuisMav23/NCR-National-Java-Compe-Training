import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int largest = 0;
      int secondLargest = 0;
      while (true) {
        int n = scanner.nextInt();
        if (n == 0) {
          break;
        }
        if (n > largest) {
          secondLargest = largest;
          largest = n;
        } else if (n > secondLargest) {
          secondLargest = n;
        }
      }
      if (largest == 0) {
        break;
      }
      int gcd = gcd(largest, secondLargest);
      System.out.println(largest + " " + secondLargest + " " + gcd);
    }
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}