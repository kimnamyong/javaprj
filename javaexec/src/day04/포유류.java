package day04;

public interface 포유류 {
 void bear();

 // 기본메서드- java 8부터 등장
 default void cure(){
  System.out.println("우유를 먹이다.");
 }

 static int age = 0;

 // 정적메서드
 static void aging(String ani){

  System.out.println(ani+"가 나이를 먹다");
 }

}


