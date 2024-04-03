import java.util.Scanner;

public class DivisibleBy7and13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = scanner.nextInt();
    if (number % 7 == 0 && number % 13 == 0) {
      int quotientBy7 = number / 7;
      int quotientBy13 = number / 13;
      int remainderBy7 = number % 7;
      int remainderBy13 = number % 13;
      System.out.println("The number is divisible by 7 and 13 simultaneously.");
      System.out.println("Quotient of " + number + " when divided by 7: " + quotientBy7);
      System.out.println("Remainder of " + number + " when divided by 7: " + remainderBy7);
      System.out.println("Quotient of " + number + " when divided by 13: " + quotientBy13);
      System.out.println("Remainder of " + number + " when divided by 13: " + remainderBy13);
    } else {
      System.out.println("The number is not divisible by 7 and 13 simultaneously.");
    }
  }
}