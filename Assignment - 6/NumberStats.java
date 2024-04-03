import java.util.Scanner;

public class NumberStats {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    int sum = 0;
    while (true) {
      System.out.println("Enter a number (-1 to stop): ");
      int number = scanner.nextInt();
      if (number == -1) {
        break;
      }
      if (number > largest) {
        largest = number;
      }
      if (number < smallest) {
        smallest = number;
      }
      sum += number;
      count++;
    }
    if (count > 0) {
      double average = (double) sum / count;
      System.out.println("The largest number entered: " + largest);
      System.out.println("The smallest number entered: " + smallest);
      System.out.println("The average of all the numbers entered: " + average);
    } else {
      System.out.println("No numbers were entered.");
    }
  }
}