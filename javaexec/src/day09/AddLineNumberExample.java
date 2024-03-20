package day09;

import java.io.*;

public class AddLineNumberExample {

 public static void main(String[] args) throws IOException {
  String filePath = "src/day09/AddLineNumberExample.java";

  FileReader fr = new FileReader(filePath);
  BufferedReader br = new BufferedReader(fr);

  int rowNumber = 0;
  String rowData;
  while( (rowData=br.readLine())!= null ) {
   System.out.println(++rowNumber + ": " + rowData);
  }

  // BufferdWriter 기본예제
  BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
  bw.write("Hello, World!");
  bw.newLine();
  bw.write("Java is fun!");
  bw.flush();

// BufferedWriter로 파일 복사하기
  String path="D:/kny/java/javaprj/javaexec/src/day09/AddLineNumberExample.java";

  //FileReader fr2 = new FileReader("D:/temp/test1.txt");
  FileReader fr2 = new FileReader(path);
  BufferedReader br2 = new BufferedReader(fr2);

  BufferedWriter bw2=new BufferedWriter(new FileWriter("D:/temp/target.txt"));

  String line;
  while ((line=br2.readLine()) != null){
   bw2.write(line);
   bw2.newLine();
  }
  bw2.flush();
  bw2.close();
  br.close();
 }
}
