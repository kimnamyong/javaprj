package day01;

public class PersonTest {
 public static void main(String[] args) {
    Person p1 = new Person("강감찬",10);
    Person p2 = new Person("강감찬",10);

  System.out.println(p1);
  System.out.println(p2.toString());
  System.out.println(p1==p2); // false
  System.out.println(p1.equals(p2));  // true

 }
}
