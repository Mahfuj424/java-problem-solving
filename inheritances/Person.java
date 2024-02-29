package inheritances;

class Person {
     String name;
     int age;

     void displayInformation1() {
          System.out.println("name :" + name);
          System.out.println("Age :" + age);
     }
}

class Teacher extends Person {
     String qualification;

     void displayInformation2() {
          displayInformation1();
          System.out.println("qualification :" + qualification);
     }
}

class College extends Teacher {
     String college_name;

     void displayInformation3() {
          displayInformation2();
          System.out.println("college name : " +college_name);
     }
}


class Test {
     public static void main(String[] args) {
          College t1 = new College();
          t1.name = "Mahfuj Alam";
          t1.age = 20;
          t1.college_name = "moulvibazar Polytechnic institute";
          t1.qualification = "diploma engineering";
          t1.displayInformation3();
     }
}