package day06;

public class TryTest {
 public static void main(String[] args) {

//  try {
//   Class clazz = Class.forName("java.lang.String2");
//   System.out.println(clazz);
//  } catch(ClassNotFoundException e) {
//     System.out.println("클래스가 존재하지 않습니다.");
//   System.out.println(e);
//  }
//  String data1 = null;
//  String data2 = null;
//  try {
//   data1 = args[0]; // 예외발생
//   data2 = args[1];
//  } catch(ArrayIndexOutOfBoundsException e) {
//   System.out.println("실행 매개값의 수가 부족합니다.");
//   return;
//  }
//  try {
//   int value1 = Integer.parseInt(data1);  // 예외발생
//   int value2 = Integer.parseInt(data2);
//   int result = value1 + value2;
//   System.out.println(data1 + "+" + data2 + "=" + result);
//  } catch(NumberFormatException e) {
//   System.out.println("숫자로 변환할 수 없습니다.");
//  } finally {
//   System.out.println("다시 실행하세요.");
//  }
  try {
   String data1 = args[0];
   String data2 = args[1];
   int value1 = Integer.parseInt(data1);
   int value2 = Integer.parseInt(data2);
   int result = value1 + value2;
   System.out.println(data1 + "+" + data2 + "=" + result);
  } catch(ArrayIndexOutOfBoundsException e) {
   System.out.println("실행 매개값의 수가 부족합니다.");
  } catch(NumberFormatException e) {
   System.out.println("숫자로 변환할 수 없습니다.");
  } finally {
   System.out.println("다시 실행하세요.");
  }


 } //
}  //
