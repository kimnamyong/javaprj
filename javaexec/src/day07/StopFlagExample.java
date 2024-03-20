package day07;

public class StopFlagExample {
 public static void main(String[] args) {
  PrintThread1 printThread = new PrintThread1();
  printThread.start();

  try {
   Thread.sleep(1);
  } catch (InterruptedException e) {
   System.out.println("인터럽트 상태");
  }
  printThread.setStop(true);

 }
}

class PrintThread1 extends Thread {
 private boolean stop;

 public void setStop(boolean stop) {
  this.stop = stop;
 }

 public void run() {
  while(!stop) {
   for(int i=0;i<1000;i++)
    System.out.println("실행 중"+i);
  }
  System.out.println("자원 정리");
  System.out.println("실행 종료");
 }
}
