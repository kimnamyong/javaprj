package day02;

public class SignTest {

 public static void main(String[] args) {
   int x=-100;
   int r1=+x;
   int r2=-x;

   // 부호연산자
  System.out.println(x);  // -100
  System.out.println(r1);  // -100
  System.out.println(r2);  // 100

  byte b=100;  // -128~127
  //byte a=-b;  컴파일 에러
  int a=-b;   // 부호연산자는 int 형이다.

  // 증감연산자  ++  --
  int y=10;
  y++;
  System.out.println("y=>" + y);  // 11
  System.out.println("y=>" + y--);  // 11 -> 10
  System.out.println("y=>" + ++y);  // 11
  --y;
  System.out.println("y=>" + y);

  // 단항연산자- 논리부정연산자
  boolean play=true;
  System.out.println(play);  // true
  play = !play ;
  System.out.println(play);  // false

  // 산술연산자 + - * /  % 나머지
  int num1=100;
  int num2=200;

  double result=(double) num1 / num2 ;
  // 강제 형변환
  System.out.println(result); // 0.0

  // char 타입
  char c1='A';
  char c2=66;
  System.out.println(c1+","+c2); // A, B
  int c3=c2+1;
  System.out.println(c3);
  int c4=c1+3;
  System.out.println(c4);
  char c5= (char) (c1+5);
  System.out.println(c5); // F

// 비교연산자
  System.out.println(num1 > num2); //
  double num3=0.1;  // 실수형
  float num4=0.1F;  // 실수형
  long num5=10L;  // 정수형

  // 논리연산자  && &,  ||  |
  //  ^   XOR 배타적논리합
  // ! 부정

  // 복합대입연산자  +=  -=  *=

  // 삼항연산자
  int 점수=85;
  char 등급=(점수>90) ? 'A' : ((점수>80)?'B' :'C');

  if(점수>90){
   등급='A';
  }else if (점수>80){
   등급='B';
  }else {
   등급='C';
  }
  System.out.printf("학생은 %c 학점입니다",등급);

 }  // main
}  // class
