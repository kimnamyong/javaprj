package day04;

// 추상클래스
public abstract class Phone {
 //필드
 public String owner;

 //생성자
 public Phone(String owner) {
  this.owner = owner;
 }

 //메소드
// public void turnOn() {
//  System.out.println("폰 전원을 켭니다.");
// }
 // 추상메소드->하위클래스에서 반드시 구현해야 한다.
 public abstract void turnOn();
 public abstract void turnOff();
// public void turnOff() {
//  System.out.println("폰 전원을 끕니다.");
// }

}
