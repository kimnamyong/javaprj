package day02;

public class Test2 {
 public static boolean isNullEmptyBlank(String s) {
  return s == null || s.trim().isEmpty();
 }

 public static void main(String[] args) {

  String[] a = {null, "", " ", "  ", " \t ", " \t\n", " . "};

  for (String s : a)
   System.out.println(isNullEmptyBlank(s));
 }

}
