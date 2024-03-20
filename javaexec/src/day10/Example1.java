package day10;

import java.util.Arrays;

public class Example1 {
 public static void main(String[] args) {
  String[] a = new String[] { "010-323-1232", "02-542-3322", "010-9930-1123", "032-431-2323" };
  String regex = "0(2|[1-9]{2})-[0-9]{3}-[0-9]{4}";

  for (String s : a) {
   if (s.matches(regex))
    System.out.printf("\"%s\" matches \"%s\"\n", s, regex);
   else
    System.out.printf("\"%s\" doesn't match \"%s\"\n", s, regex);
  }

  String[] a1 = new String[] { "010-323-1232", "02-542-3322", "010-9930-1123", "032-431-2323" };
  String regex1 = "010-[0-9]{3,4}-[0-9]{4}";

  for (String s : a1) {
   if (s.matches(regex1))
    System.out.printf("\"%s\" matches \"%s\"\n", s, regex);
   else
    System.out.printf("\"%s\" doesn't match \"%s\"\n", s, regex);
  }

  String[] a2 = new String[] {
          "http://localhost:8080/test/list.jsp?pg=3&sz=15",
          "http://localhost:8080/test/list.jsp?pg=9&sz=10",
          "http://localhost:8080/test/list.jsp?pg=25&sz=20"
  };
  String regex2 = "pg=[0-9]+";

  for (String s : a2) {
   String temp = s.replaceAll(regex2, "pg=1");
   System.out.printf("%s => %s\n", s, temp);
  }


  String[] a3 = new String[] {
          "http://localhost:8080/test/list.jsp?pg=3&sz=15",
          "http://localhost:8080/test/list.jsp?pg=9&sz=10",
          "http://localhost:8080/test/list.jsp?pg=25&sz=20"
  };
  String regex3 = "(\\?|&)[a-z]+=[0-9]+";

  for (String s : a3) {
   String temp = s.replaceFirst(regex3, "");
   System.out.printf("%s => %s\n", s, temp);
  }

  String s = "<table>\n" +
          "\t<tr>\n\t\t <td>홍길동</td>\n\t\t <td>18</td>\n\t</tr>\n" +
          "\t<tr>\n\t\t <td>전우치</td>\n\t\t <td>20</td>\n\t</tr>\n" +
          "</table>\n";
  System.out.printf("-------- (0)\n%s\n\n", s);

  s = s.replaceAll("[ \t\n]+", "");
  System.out.printf("-------- (1)\n%s\n\n", s);

  s = s.replaceAll("</tr>", "\n");
  System.out.printf("-------- (2)\n%s\n\n", s);

  s = s.replaceAll("</td><td>", ", ");
  System.out.printf("-------- (3)\n%s\n\n", s);

  s = s.replaceAll("</?[a-zA-Z]+>", "");
  System.out.printf("-------- (4)\n%s\n\n", s);


  String s2 = "one two, three,\t four; \t\nfive..,six";
  String[] a4 = s2.split("[ ,.;\t\n]+");
  System.out.println(Arrays.toString(a4));


 } //
}
