// -*- encoding: UTF-8 -*-

package day02;

public class MainTest {
 public static void main(String[] args) {

  if(args.length !=2){
   System.out.println("인수가 모자랍니다....");
   System.exit(0);
  }

  String str1=args[0];
  String str2=args[1];

  System.out.println(str1+" 과 "+str2+" 전달하였습니다.... ");

 }
}
