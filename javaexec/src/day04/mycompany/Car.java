package day04.mycompany;

import day04.hankook.Tire;
import day04.hyndai.Engine;
import day04.kumho.BigTire;

public class Car {
 // 필드
 public String company;
 private int speed;

 public int getSpeed() {
  return speed;
 }

 public void setSpeed(int speed) {
  if(speed<0){
   this.speed=0;
  }else{
   this.speed = speed;
  }
 }

 Engine engine;
 Tire tire1;
 BigTire bigTire;

 public Car(String company, Engine engine, Tire tire1, BigTire bigTire) {
  this(company);
  this.company = company;
  this.engine = engine;
  this.tire1 = tire1;
  this.bigTire = bigTire;
 }

 public Car(String company) {
  engine=new Engine();
  tire1=new Tire();
  bigTire=new BigTire();
  System.out.println(company+"자동차를 생산하였습니다.");
 }

 public String getCompany() {
  return company;
 }
 public void setCompany(String company) {
  this.company = company;
 }
}  // end
