import java.util.Scanner;

public class Dighat {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          float a = scan.nextInt();
          float b = scan.nextInt();
          float c = scan.nextInt();
          float d, x1, x2;
          d = b * b - 4 * a * c;
          if (d > 0) {
               x1 = (-b + sqrt(d)) / (2 * a);
               x2 = (-b - sqrt(d)) / (2 * a);
               System.out.println("The x1 are: " + x1);
               System.out.println("The x2 are: " + x2);
          }
          else{
               System.out.println("Roots are imaginary");
          }
     }

     private static float sqrt(float d) {
          return 0;
     }
}
