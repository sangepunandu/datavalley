import java.util.Scanner;

public class LibraryFine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of days the member is late to return the book: ");
    int daysLate = scanner.nextInt();
    double fine = 0.0;
    if (daysLate > 21) {
      System.out.println("Your membership has been cancelled.");
      return;
    }
    if (daysLate >= 15) {
      fine = 5.0;
    } else if (daysLate >= 8) {
      fine = 1.0;
    } else if (daysLate >= 1) {
      fine = 0.5;
    }
    System.out.println("The fine for the book is: " + fine + " rupees.");
  }
}