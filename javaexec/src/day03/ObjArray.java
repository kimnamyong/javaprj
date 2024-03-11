package day03;

import java.util.Date;

public class ObjArray {

 public static void main(String[] args) {

  int[] a1 = new int[] { 1, 2, 3 };
  int[] b1 = new int[] { 1, 2, 3 };
  String[] c1 = new String[] { "one", "two", "three" };

  System.out.println(a1.getClass().getName());
  System.out.println(b1.getClass().getName());
  System.out.println(c1.getClass().getName());
  System.out.println(a1.equals(b1));

  Object[] a = new Object[7];
  Person p = new Person("전우치", 24);

  a[0] = "hello";
  a[1] = new String("world");
  a[2] = new Date();
  a[3] = new Person("홍길동", 18);
  a[4] = new int[] { 1, 2, 3 };
  a[5] = new String[] { "one", "two", "three" };
  a[6] = new Person[] { new Person("임꺽정",22), p };

  for (Object o : a) {
   System.out.println(o);
  }


 }
}
