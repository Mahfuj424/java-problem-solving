import java.util.Scanner;

public class Even_number {
     public static void main(String[] args) {
          System.out.println("Enter the number of n : ");
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          int sum=0;
          int i;
          for (i = 2; i <= n; i = i + 2) {
               sum = sum + i;
          }
          System.out.println("The Summation fo series : " + sum);
     }
}
