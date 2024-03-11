package day03;

import java.util.Timer;
import java.util.TimerTask;

public class StarCraft {
 public static void main(String[] args) throws InterruptedException {

   Teran 마린1=new Teran("마린");

   마린1.attack("저그");
   마린1.attack("프로토스");

   Teran 메딕1=new Teran("메딕");

   메딕1.cure("마린");

   마린1.defend("저그");
   마린1.defend("저그");

   SCV scv1=new SCV();
   scv1.run();

   Timer money =new Timer();
   money.schedule(scv1, 1000,3000);
   // 1초후에 작업실행, 3초마다 반복
   //              객체, 실행시간, 실행주기

   Thread.sleep(5000);
   // 5초동안 일시정지

  System.out.println("광물이 다떨어졌습니다.");
   money.cancel();
 }
} //

class SCV extends TimerTask {
 @Override
 public void run() {
  System.out.println("광물(돈)을 캐고 있습니다.");
 }
}






