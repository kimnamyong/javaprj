package day04;

public class RemoteControlTest {
 public static void main(String[] args) {
  RemoteControl rc=new Television();
  RemoteControl rc1=new Audio();

 rc.setVolume(10);
 rc.turnOn();
 rc1.turnOff();
 }
}
