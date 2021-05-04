
import java.util.Scanner;

public class CA1_Task4_2012547 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] numberOfBooks = new int[3];
    System.out.println("Enter the book number");
    for (int i = 0; i < numberOfBooks.length; i++) {
      numberOfBooks[i] = in.nextInt();
    }
    System.out.println("Using recursive methods");
    for (int numberOfBook : numberOfBooks) {
      System.out.println("For " + numberOfBook + " books, the total number of pages is " + recursiveCountPages(numberOfBook));
    }
    System.out.println("Using iterative methods");
    for (int numberOfBook : numberOfBooks) {
      System.out.println("For " + numberOfBook + " books, the total number of pages is " + iterativeCountPages(numberOfBook));
    }
    
    
    System.out.println("Using recursive methods");
    
  }
  
  public static int recursiveCountPages(int numberOfBooks) {
    if (numberOfBooks != 0)
      return ((50 + (int) (Math.random() * 800 - 50 + 1)) + recursiveCountPages(numberOfBooks - 1));
    
    return 0;
  }
  
  public static int iterativeCountPages(int numberOfBooks) {
    int totalPages = 0, pageCount;
    for (int i = 0; i < numberOfBooks; i++) {
      pageCount = 50 + (int) (Math.random() * 800 - 50 + 1);
      totalPages += pageCount;
    }
    return totalPages;
  }
}
