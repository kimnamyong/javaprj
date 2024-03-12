package day04;

import day04.CellPhone;

public class DmbCellPhone extends CellPhone {
 int channel;

 public DmbCellPhone(String model, String color,int channel) {
  super(model,color);
  //super(); // 부모생성자 호출
  this.channel = channel;
  this.model=model;
  this.color=color;
 }


// void powerOn() {
//  super.powerOn();
// }

 // 상속받은 부모메소드 재정의 한다.
 @Override
  void powerOn(){
  System.out.println(model+ "전원을 키고, 운영체제를 부팅합니다.");
 }

 //메소드
 void turnOnDmb() {
  System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
 }

 void changeChannelDmb(int channel) {
  this.channel = channel;
  System.out.println("채널 " + channel + "번으로 바꿉니다.");
 }

 void turnOffDmb() {
  System.out.println("DMB 방송 수신을 멈춥니다.");
 }

}
