
class Method {
     void add(int x, int y) {
          int z = x + y;
          System.out.println("z = " + z);
     }

     void add(int a, int b, int c) {
          int d = a + b + c;
          System.out.println("D = " + d);
     }

     void add(int e, int f, int g, int h) {
          int i = e + f + g + h;
          System.out.println("f = " + i);
     }
}

public class Methodoverloading {
     public static void main(String[] args) {
          Method ob = new Method();
          ob.add(5, 4);
          ob.add(2, 4, 6);
          ob.add(2, 4, 6, 8);
     }
}
