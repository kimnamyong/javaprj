package day06;

public class ExceptionTest {
 public static void main(String[] args) {
//  String data = null;
//  System.out.println(data.toString());

//  if(args.length == 2) {
//   String data1 = args[0];
//   String data2 = args[1];
//   System.out.println("args[0]: " + data1);
//   System.out.println("args[1]: " + data2);
//  } else {
//   System.out.println("두개의 실행 매개값이 필요합니다.");
//  }

//  String data1 = "100";
//  String data2 = "a100";
//
//  int value1 = Integer.parseInt(data1);
//  int value2 = Integer.parseInt(data2);
//
//  int result = value1 + value2;
//  System.out.println(data1 + "+" + data2 + "=" + result);
  Dog dog = new Dog();
  changeDog(dog);

  Cat cat = new Cat();
  changeDog(cat);

 }  //

 public static void changeDog(Animal animal) {
  if (animal instanceof Dog) {
   Dog dog = (Dog) animal;  //ClassCastException 발생 가능
  }
 }

} //

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}