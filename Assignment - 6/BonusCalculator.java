import java.util.Scanner;

public class BonusCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the current year: ");
    int currentYear = scanner.nextInt();
    System.out.println("Enter the year in which the employee joined the organization: ");
    int joinYear = scanner.nextInt();
    int yearsOfService = currentYear - joinYear;
    int bonus = 0;
    if (yearsOfService > 5) {
      bonus = 5000;
    } else if (yearsOfService >= 3) {
      bonus = 3000;
    } else if (yearsOfService < 3) {
      System.out.println("No bonus is awarded.");
      return;
    }
    System.out.println("The employee's bonus is: " + bonus);
  }
}