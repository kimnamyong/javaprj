package day05;

import java.util.Arrays;

public class Person implements Comparable<Person>{

 String name;
 int age;

 public Person(String name, int age) {
  this.name = name;
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 @Override
 public String toString() {
  return "Person{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
 }

 @Override
 public int compareTo(Person p) {
  int r = this.name.compareTo(p.name);
  if (r != 0) return r;
  return this.age - p.age;
 }

 public static void main(String[] args) {
  Person[] a = new Person[] {
          new Person("홍길동", 18),
          new Person("임꺽정", 22),
          new Person("전우치", 23),
          new Person("김가나", 23),
  };

  Arrays.sort(a);
  System.out.println(Arrays.toString(a));

 }
}
