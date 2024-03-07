package day01;

import java.util.Objects;

public class Person {
 // 멤버 변수, 필드
 String name;
 int age;

 public Person(String name, int age) {
  this.name = name;
  this.age = age;
 }

 @Override
 public String toString() {
  return String.format("Person{name=\"%s\", age=%d}", name, age);
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (!(o instanceof Person person)) return false;
  return age == person.age && Objects.equals(name, person.name);
 }

 @Override
 public int hashCode() {
  return Objects.hash(name, age);
 }
}
