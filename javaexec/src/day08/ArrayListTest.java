package day08;

import java.util.ArrayList;

public class ArrayListTest {
 public static void main(String[] args) {
  ArrayList<String> fruits = new ArrayList<>();
  fruits.add("사과");
  fruits.add("바나나");
  fruits.add("딸기");
  fruits.add("포도");

  ArrayList<String> exclude = new ArrayList<>();
  exclude.add("사과");
  exclude.add("바나나");

  fruits.retainAll(exclude);
  System.out.println(fruits); // ["사과", "바나나"]


 }
}
