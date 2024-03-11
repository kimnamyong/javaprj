package day03;

public class CallByRef {
 public static void main(String[] args) {
    Person2 p = new Person2();
  // p->인스턴스 변수 힙영역(heap)에 저장
  // p->스택영역
  // Person -> 힙영역

    p.name="장돈건" ;

    method(p);

  System.out.println("main : " +p.name); // 강감찬
// 참조값 전달 이기때문에 method에 영향을 받는다.

 } //

 private static void method(Person2 p) {
  p.name="강감찬";
  System.out.println("method :" + p.name); // 강감찬
 }
} //
