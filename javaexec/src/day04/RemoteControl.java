package day04;

public interface RemoteControl {
 //상수
 int MAX_VOLUME = 10;
 int MIN_VOLUME = 0;

 //추상 메소드
 abstract void turnOn();
 void turnOff();
 void setVolume(int volume);

}
