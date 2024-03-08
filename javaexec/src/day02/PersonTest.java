package day02;

public class PersonTest {
 public static void main(String[] args) {
  Person p = new Person();
  p.age = 3;
  method2(p);
  System.out.print(p.age);
 }

 static void method2(Person p) {
  p.age = 10;
 }
}

class Person {
 String name;
 int age;
}
