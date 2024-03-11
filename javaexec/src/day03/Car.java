package day03;

public class Car {
 //필드
 String company = "현대자동차";
 String model = "그랜저";
 String color = "검정";

 int maxSpeed = 350;

 private int speed;

 void run(){
 // speed+=50;
  setSpeed(50);
  System.out.println("자동차를 달립니다. 속도를 올립니다.");
 }

 public void setSpeed(int speed) {
  this.speed += speed;
 }

 public int getSpeed() {
  return speed;
 }
}
