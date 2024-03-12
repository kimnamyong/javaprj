package day04;

public class ReverseExam {
 public static void main(String[] args) {
  String originalString = "Hello, world!";

  String reversedString = reverse(originalString);

  System.out.println("Original string: " + originalString);
  System.out.println("Reversed string: " + reversedString);

  String welcome="Welcome to my World";
  StringBuilder sb = new StringBuilder(welcome);
  sb.reverse();
  System.out.println(sb);
 }
 public static String reverse(String str) {
  // StringBuilder 객체를 생성하고 원본 문자열을 추가합니다.
  StringBuilder sb = new StringBuilder(str);
  // StringBuilder의 reverse() 메서드를 사용하여 문자열을 뒤집습니다.
  sb.reverse();

  // StringBuilder를 다시 문자열로 변환하여 반환합니다.
  return sb.toString();
 }
}
