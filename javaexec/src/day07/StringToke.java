package day07;

import java.util.StringTokenizer;

public class StringToke {
 public static void main(String[] args) {
  String str = "Hello,World! How are you?";
  StringTokenizer st = new StringTokenizer(str, ", !");

  while(st.hasMoreTokens()) {
   String token = st.nextToken();
   System.out.println(token);
  }

 }
}
