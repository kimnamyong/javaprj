package day05;

import org.w3c.dom.ls.LSOutput;

// 외부클래스
public class A {

 int instanceVar;

 B field1=new B();
 C field2=new C();

 void method1(){
  B var1=new B();
  C var2=new C();
 }

 static int static1;

 //static B filed3=new B();
 static C filed4=new C();

 // 정적메소드
 static void method2(){
  // B var1=new B();
  C var2=new C();
 }

 A() {
  System.out.println("외부 A클래스 생성됨");
 }

 // 인스턴스 멤버 클래스
 public class B {

  B() {
   System.out.println("인스턴스 멤버 B클래스 생성됨");
  }

  int field1;

  void method() {
   field2=10;
   System.out.println("B클래스에 메소드1 실행됨");
   method1();
   static1=800;
   method2();
  }

  // 자바16부터 제공
  static int field2;
  static void method2() {
   System.out.println("B클래스에 스태틱 메소드2 실행됨");
  }
 } // B

 // 정적멤버클래스
 static class C {
  C() {
   System.out.println("정적멤버클래스 C 생성됨");
  }

  int field1;
  static int field2;

  void method() {
   static1=700;
   //method1();
   method2();
   //instanceVar=400;

   System.out.println("정적멤버클래스 C에 인스턴스 메소드1 실행됨");
  }

  static void method2() {
   System.out.println("정적멤버클래스 C에 정적 메소드2 실행됨");
  }
 } //C

 void method() {
  int localVar=10;

  // 로컬클래스
  class D {
   D() {
    System.out.println("메소드에 로컬클래스 D 생성됨");
   }
   int field1;
   void method1() {
   // localVar=20;

    System.out.println("로컬클래스 D에 메소드 2 실행됨");

   }
   static int field2;
   static void method2(){
    System.out.println("로컬클래스D에 메소드2 실행됨");
   }
  } //D

  D d = new D();
  d.field1 = 100;
  d.method1();
 } // method

 public static void main(String[] args) {
  A a=new A();
  a.method();
  A.B.method2();
  System.out.println("========");

  // 인스턴스 멤버클래스
  A.B b=a.new B();
 // b.method1();
  b.field1=200;
  System.out.println("========");
  b.field2=500;
  b.method2();

 // 정적멤버 클래스
  A.C c=new A.C();
  c.field1=300;
 // c.method1();
  System.out.println("========");

  c.field2=400;
  // 로컬클래스
  a.method();

 } // main
} // A
