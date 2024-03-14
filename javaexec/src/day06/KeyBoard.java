package day06;

import java.io.IOException;

public class KeyBoard {
 public static void main(String[] args) throws IOException {
  byte[] bytes = new byte[100];

  System.out.print("입력: ");
  int readByteNo = System.in.read(bytes);

  String str = new String(bytes, 0, readByteNo-2);
  //String str = new String(bytes, 0);
  //     /r  /n   enter는 13번과 10번에 해당
  System.out.println(str);

 }
}
