package day02;

public class ForTest {
 public static void main(String[] args) {
//  for (int m=2; m<=9; m++) {
//   System.out.println("*** " + m + "단 ***");
//   for (int n=1; n<=9; n++) {
//    System.out.println(m + " x " + n + " = " + (m*n));
//   }
//  }
  Outter:
  for(char upper='A'; upper<='Z'; upper++) {
   for(char lower='a'; lower<='z'; lower++) {
    System.out.println(upper + "-" + lower);
    if(lower=='g') {
     break Outter;
    }
   }
  }
  System.out.println("프로그램 실행 종료");
 }
}
