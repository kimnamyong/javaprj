package day03;

public class StudentTest {
 public static void main(String[] args) {
  Student s1=new Student();
  Student s2=new Student("100","이순신",30);

  System.out.println(s1);
  System.out.println(s2);

  s1.setStudentNo("101");
  s1.setStudenName("원빈");
  s1.setStudentAge(25);

  System.out.println(s1);
  System.out.println(s2.getStudenName());


 }
}
