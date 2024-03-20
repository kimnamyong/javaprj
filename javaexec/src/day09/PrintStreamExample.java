package day09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamExample {
 public static void main(String[] args) throws FileNotFoundException {
  FileOutputStream fos = new FileOutputStream("D:/temp/printstream.txt");
  PrintStream ps = new PrintStream(fos);

  ps.println("[프린터 보조 스트림]");
  ps.print("마치 ");
  ps.println("프린터가 출력하는 것처럼 ");
  ps.println("데이터를 출력합니다.");

  ps.flush();
  ps.close();

  FileOutputStream fos2 = new FileOutputStream("D:/temp/printstream2.txt");
  PrintWriter ps2 = new PrintWriter(fos2);

  ps2.println("[프린터 보조 스트림]2");
  ps2.print("마치 ");
  ps2.println("프린터가 출력하는 것처럼.. ");
  ps2.println("데이터를 출력합니다...");

  ps2.flush();
  ps2.close();

 }
}
