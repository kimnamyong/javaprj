package day05;

import java.util.Arrays;
import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

 @Override
 public int compare(Person p1, Person p2) {
  int r = p1.age - p2.age;             // 먼저 나이(age)를 비교한다.
  if (r != 0) return r;                // 나이가 같지 않다면, 나이 비교 결과를 리턴한다.
  return p1.name.compareTo(p2.name);
 }

 public static void main(String[] args) {
  Person[] a = new Person[] {
          new Person("홍길동", 18),
          new Person("임꺽정", 22),
          new Person("전우치", 23)
  };
//  Arrays.sort(a, new PersonNameComparator());
//  System.out.println(Arrays.toString(a));
  Arrays.sort(a, new PersonAgeComparator());
  System.out.println(Arrays.toString(a));


 }
}
