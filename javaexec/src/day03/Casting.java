package day03;

public class Casting {
 public static void main(String[] args) {
  Parent p;
  Child c1,c2;

  p = new Parent("부모1");
  c1 = new Child("아들1", 18);
  c2 = new Child("아들2", 16);

  // c1 = new Parent("강감찬");
  //c1 = p;

  System.out.println(p);
  System.out.println(c1);
  System.out.println(c2);

  p=c1;
  System.out.println(p);


 }
}


class Parent {
 String name;

 public Parent(String name) {
  this.name = name;
 }

 @Override
 public String toString() {
  return name;
 }
}

class Child extends Parent{
 int age;
 public Child(String name,int age) {
  super(name);
  this.age=age;
 }

 @Override
 public String toString() {
  return  "age=" + age + ", name='" + name ;
 }
}
