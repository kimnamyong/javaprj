package day05;

// 구현클래스
public class ImpC implements IC{
 @Override
 public void methodA() {
  System.out.println("A메소드 실행");
 }
 @Override
 public void methodB() {
  System.out.println("B메소드 실행");
 }
 @Override
 public void methodC() {
  System.out.println("C메소드 실행");
 }

 public static void main(String[] args) {
   ImpC impl=new ImpC();
   impl.methodA();
   impl.methodB();
   impl.methodC();

   IA ia=impl;
   ia.methodA();

   IB ib=impl;
   ib.methodB();

   IC ic=impl;
   ic.methodC();
   ic.methodB();
   ic.methodA();
 }

}//
