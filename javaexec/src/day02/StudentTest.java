package day02;

public class StudentTest {
 public static void main(String[] args) {

 Student 학생1= new Student("강감찬",20);
 Student 학생2= new Student("강감찬",20);
 Student 학생3= new Student("이순신",20);

  System.out.println(학생1);

  System.out.println(학생1==학생2);
  System.out.println(학생1==학생3);

  System.out.println(학생1.equals(학생2)); // true
  System.out.println(학생1.equals(학생3)); // false

 }
}
