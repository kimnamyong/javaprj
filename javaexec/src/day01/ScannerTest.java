package day01;

import java.util.Scanner;

public class ScannerTest {
 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);

  String inputData;

//  while (true){
//   inputData=scan.nextLine();
//   // enter 입력되기 전까지 모든 문자열을 읽는다.
//   System.out.println("입력된 문자열 : " +inputData);
//   if(inputData.equals("q")){
//    break;
//   }
//  }
//  System.out.println("종료-식사시간입니다.");


  String str1 =new String("welcome");
  String str2 =new String("welcome");
  System.out.println(str1==str2);

  Integer num1= Integer.valueOf("100");
  Integer num2= Integer.valueOf("100");
  System.out.println(num1==num2);
  System.out.println(num1.equals(num2));

 }
}
