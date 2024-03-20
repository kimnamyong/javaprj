package day07;

import java.awt.*;

public class ThreaTask2 {
 public static void main(String[] args) {

  Thread thread=new Thread(){

  // 익명자식객체
   @Override
   public void run() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for(int i=0; i<5; i++) {
     toolkit.beep();
     try {
      Thread.sleep(500);
      System.out.println("비프음"+ i);
     } catch (Exception e) {
     }
    }
   }
  } ;
  thread.start();

  for(int i=0; i<5; i++) {
   System.out.println("띵");
   try { Thread.sleep(500); } catch(Exception e) {}
  }


 } // main
} //
