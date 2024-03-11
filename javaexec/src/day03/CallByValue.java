package day03;

public class CallByValue {
 public static void main(String[] args) {
   int a=10;
   method(a);
  System.out.println("main => " + a); //10
  // 변수 a의 값이 method와 무관하다.

 } //

 private static void method(int a) {
   a=200;
  System.out.println("method=> " +a); //200
 }

}//

