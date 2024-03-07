package day01;

public class IntegerExec {
 public static void main(String[] args) {
  // 정수 리터럴(literal)
  int var1=0b1011;  // 2진수 -> 11
  int var2=010; // 8진수  -> 8
  int var3=123; // 10진수
  int var4=0xA;  // 16진수 -> 10

  System.out.println("var1 : " + var1);
  System.out.println("var2 : " + var2);
  System.out.println("var3 : " + var3);
  System.out.println("var4 : " + var4);

   byte a= -128;
   byte b=127;
   System.out.println(a);
   long c=10;
   long d=20L;
  System.out.println("c : " + c);
  System.out.println("d : " + d);

  long var5=100000000000L;
  System.out.println(var5);

 }
}
