package day07;

public class ThreadExample {
 public static void main(String[] args) {

  Thread thread1 = new MovieThread();
  thread1.start();

  Thread thread2 = new Thread(new MusicRunnable());  // 1
  thread2.start();

 }
}
class MovieThread extends Thread {   // 2
 @Override
 public void run() {
  for(int i=0;i<3;i++) {
   System.out.println("동영상(Movie)을 재생합니다.");
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
   }
  }
 }
}
class MusicRunnable implements Runnable {  // 3
 @Override
 public void run() {
  for(int i=0;i<3;i++) {
   System.out.println("음악(Music)을 재생합니다.");
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
   }
  }
 }
}
