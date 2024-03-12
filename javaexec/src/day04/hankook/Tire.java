package day04.hankook;

public class Tire {
 // 필드
  String company="한국타이어";

 // 생성자
 // 기본생성자
 public Tire() {
  System.out.println(company+"를 장착하였습니다.");
 }

 // 멤버필드가 있는 생성자
 public Tire(String company) {
  this.company = company;
   printTire();
 }

 // 메소드
 public void printTire() {
  System.out.println(company+"를 장착하였습니다.");
 }


 @Override
 public String toString() {
  return  company +"를 장착하였습니다" ;
 }
}
