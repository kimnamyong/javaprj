package day05;

class StringUtils {
 public static boolean isNullOrEmpty(String s)  {
  return s == null || s.length() == 0;
 }

 public static boolean isNullOrBlank(String s) {
  return s == null || s.trim().length() == 0;
 }

 public static boolean isEmpty(String s) {
  return s.length() == 0;
 }

 public static boolean isBlank(String s) {
  return s.trim().length() == 0;
 }

 public static void main(String[] args) {
  String s = "hello";
  String errorMessage;

  if (StringUtils.isNullOrBlank(s) == true) {
   errorMessage = "내용을 입력하세요";

   System.out.println(errorMessage);
  }
 }
}

