

class Person {
     String name;
     int age;

     void displayInformation() {
          System.out.println("Name :" + name);
          System.out.println("age :" + age);
     }
}


class Teacher extends Person{
     String qualification;

     @Override
     void displayInformation() {
          System.out.println("Name :" + name);
          System.out.println("age :" + age);
          System.out.println("Qualification :" + qualification);
     }
}

public class Method_overriding {
     public static void main(String[] args) {
          Teacher t1 = new Teacher();
          t1.name = "Mahfuj Alam";
          t1.age = 20;
          t1.qualification = "diploma engineer";
          t1.displayInformation();
     }
}
