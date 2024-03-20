package day07;

import java.awt.*;

public class BeepPrintExample1 {
 public static void main(String[] args) {
  // 메인스레드
  Toolkit toolkit = Toolkit.getDefaultToolkit();

  for (int i = 0; i < 5; i++) {
   toolkit.beep(); // 비프음 발생
   try {
    Thread.sleep(500); // 0.5초간 일시정지
    System.out.println("소리가 납니다" + i);
   } catch (Exception e) {
   }
  }

  for (int i = 0; i < 5; i++) {
   System.out.println("띵" + i);
   try {
    Thread.sleep(500);
   } catch (Exception e) {
   }
  }

 }
}
