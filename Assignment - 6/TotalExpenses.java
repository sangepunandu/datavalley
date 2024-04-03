import java.util.Scanner;

public class TotalExpenses {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the quantity of items purchased: ");
    int quantity = scanner.nextInt();
    System.out.println("Enter the price per item: ");
    double pricePerItem = scanner.nextDouble();
    double totalExpenses = quantity * pricePerItem;
    if (quantity > 50) {
      totalExpenses = totalExpenses - totalExpenses * 0.10;
    } else if (quantity >= 25 && quantity <= 50) {
      totalExpenses = totalExpenses - totalExpenses * 0.05;
    }
    System.out.println("The total expenses with discount: " + totalExpenses);
  }
}