package day09;

import java.io.*;

public class ReadLineTest {
 public static void main(String[] args) throws IOException {

  String str=ReadLineTest.class.getResource("lang.txt").getPath();

  Reader reader=new FileReader(str);
  BufferedReader br=new BufferedReader(reader);

  while (true){
   String data=br.readLine();
   if(data==null) break;
   System.out.println(data);

  }

 }
}
