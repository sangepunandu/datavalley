import java.util.Scanner;

public class VowelCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String input = scanner.nextLine();
    int vowelCount = 0;
    boolean vowelPresent = false;
    String vowels = "aeiouAEIOU";
    for (char c : input.toCharArray()) {
      if (vowels.indexOf(c) != -1) {
        vowelCount++;
        vowelPresent = true;
      }
    }
    System.out.println("The total number of vowels present: " + vowelCount);
    if (vowelPresent) {
      System.out.println("Vowels are present in the string.");
    } else {
      System.out.println("Vowels are not present in the string.");
    }
  }
}