public class Continue_break {
     public static void main(String[] args) {
          for (int i = 0; i < 20; i++) {
               if (i == 10) {
                    System.out.println("Ending the break condition");
                    break;
               } else {
                    if (i == 5) {
                         continue;
                    }
                    System.out.println(i);
                    System.out.println("skip this number");
               }

          }
     }
}
