package day08;

import java.util.StringTokenizer;

public class StringTokenTest {
 public static void main(String[] args) {
  String str="Hello World, Welcome to my World";
  StringTokenizer st=new StringTokenizer(str," ");

  while (st.hasMoreTokens()){
   String token=st.nextToken();
   System.out.print(token+" ");
  }

 }
}
