package day03;

public class CalTest {
 public static void main(String[] args) {

  Calculator cal=new Calculator();
  int result=cal.add(30,50);
  System.out.println(result);

  Double result2=cal.divide(123.23,5.0);
  System.out.println(result2);

 }
}
