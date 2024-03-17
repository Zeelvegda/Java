//lab 4-3que
import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
      int[] array = {11,22,33,44};
      int sum = 0;
      double average= 0.0;
      for (int i = 0; i<array.length; i++) {
        sum += array[i];
      }
      average=(double) sum / array.length;
      System.out.println("The sum is: " + sum);
      System.out.println("The average is: " + average);
    }
  }