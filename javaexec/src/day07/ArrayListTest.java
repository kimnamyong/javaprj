package day07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
 public static void main(String[] args) {
  List<String> list = new ArrayList<String>();
  list.add("Java");
  list.add("JSP");
  list.add("Servlet");
  list.add("Spring");
  list.add("JPA");
  for (int i = 0; i < list.size(); i++) {
   String str = list.get(i);
   System.out.println(i + ":" + str);
  }
  int size = list.size();
  System.out.println("총개수:" + size);

  String str2 = list.get(2);
  System.out.println("2 : " + str2);

  list.remove(2);

  // 향상된 for문
  for (String val : list)
   System.out.print(val + " ");

  list.set(2, "스프링");

  // 향상된 for문
  for (String val : list)
   System.out.print(val + " ");
  System.out.println("");

  // Java 값을 찾아서 수정하기
  for (int i = 0; i < list.size(); i++) {
   if (list.get(i) == "Java") {
    list.set(i, "자바");
   }
   ;
   System.out.println(i + ":" + list.get(i));
  }


 }//
}
