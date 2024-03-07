package day01;

public class CharTest {
 public static void main(String[] args) {
  // char 타입
  char c1='A' ;
  char c2=65 ;  // A
  char c3='\u0041' ;

  System.out.println(c1);
  System.out.println(c2);
  System.out.println(c3);

  char c4='가' ;  //
  char c5=44032 ;  // 10진수
  char c6='\uac00' ;  // 16진수

  System.out.println(c4);
  System.out.println(c5);
  System.out.println(c6);

  // 문자열
  String name="홍길동" ;
  System.out.println(name);

  // 이스케이프 문자
  String str="나는 \"자바\"를 좋아합니다. " ;
  String str1="나는 \'자바\'를 좋아합니다. " ;
  String str2="번호\t이름\t나이";
  String str3="강감찬\n귀주대첩";

  System.out.println(str);
  System.out.println(str1);
  System.out.println(str2);
  System.out.println(str3);

  System.out.println("봄\\여름\\가을\\겨울");

 }
}
