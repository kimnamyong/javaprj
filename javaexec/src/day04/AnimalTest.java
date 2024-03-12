package day04;

public class AnimalTest {
 public static void main(String[] args) {
  Dog dog=new Dog();
  Cat cat=new Cat();

  dog.sound();
  cat.sound();


  //변수의 자동 타입 변환
  Animal animal = null;
  animal = new Dog();
  animal.sound();
  animal = new Cat();
  animal.sound();
  System.out.println("-----");

  //매개변수의 자동 타입 변환
  animalSound(new Dog());
  animalSound(new Cat());
  animalSound(dog);
  animalSound(cat);
 }

 public static void animalSound(Animal animal) {
  animal.sound();
 }
}
