package day04;

public class PhoneTest {
 public static void main(String[] args) {

  Phone p1=new Phone("이순신") {
   @Override
   public void turnOn() {
    System.out.println("이순신이 전원켜다");
   }

   @Override
   public void turnOff() {
    System.out.println("이순신이 전원끄다.");
   }
  };

  p1.turnOn();
  p1.turnOff();

 }
}
