public class Fibonacci {
     public static void main(String[] args) {
          int a = 0;
          int b = 1;
          int sum;
          for (int i = 1; i <= 6; i++) {
               sum = a + b;
               System.out.println("" + sum);
               a = b;
               b = sum;
          }
     }
}
