// HereToDoMyLearning

package oneone;
import java.util.Scanner;

public class Dreieck{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bitte geben Sie ein Wort ein: ");
    String word = scanner.nextLine();
    int row = 0;
    for (int i = word.length(); i > 0; i--) {
      for (int j = 0; j < row; j++) {
        System.out.print("");
      }
      for (int k = 0; k < i; k++) {
        System.out.print(word.charAt(k));
      }
      System.out.println();
      row++;
    }
    //scanner.close();
  }
}
