package day09;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {
 public static void main(String[] args) throws IOException, ClassNotFoundException {

  List<Board> list = new ArrayList<Board>();

  list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
  list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
  list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

  FileOutputStream fos = new FileOutputStream("D:/temp/board.txt");
  //OutputStreamWriter osw=new OutputStreamWriter(fos, StandardCharsets.UTF_8);
  ObjectOutputStream oos = new ObjectOutputStream(fos);
  oos.writeObject(list);
  oos.flush();
  oos.close();

  FileInputStream fis = new FileInputStream("D:/temp/board.txt");
  ObjectInputStream ois = new ObjectInputStream(fis);
  List<Board> list2 = (List<Board>) ois.readObject();
  System.out.println(list2);

 }
}
