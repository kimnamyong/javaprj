package day07;

import java.awt.*;

// 작업 정의
public class BeepTask implements Runnable {

 @Override
 public void run() {
  Toolkit toolkit = Toolkit.getDefaultToolkit();

  for (int i = 0; i < 5; i++) {
   toolkit.beep(); // 비프음 발생
   try {
    Thread.sleep(500); // 0.5초간 일시정지
    System.out.println("소리가 납니다" + i);
   } catch (Exception e) {
   }
  }
 } // run

 public static void main(String[] args) {
// 메인스레드와 작업 스레드가 동시에 실행
// 작업스레드
  Runnable beepTask = new BeepTask();
  Thread thread = new Thread(beepTask);
  thread.start(); // run이 실행된다.

// 메인스레드
  for (int i = 0; i < 5; i++) {
   System.out.println("띵" + i);
   try {
    Thread.sleep(500);
   } catch (Exception e) {
   }
  }

 } // main
}  //
