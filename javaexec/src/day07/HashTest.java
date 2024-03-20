package day07;

import java.util.*;

public class HashTest {
 public static void main(String[] args) {
  Set<String> set=new HashSet<>();

  set.add("java");
  set.add("java");
  set.add("java");
  set.add("jsp");
  set.add("jdbc");
  set.add("myBatis");

  int size=set.size();

  Iterator<String> iterator= set.iterator();
  while (iterator.hasNext()){
    String el=iterator.next();
   System.out.print(el+" " );
  }

  set.remove("JAVA");
  set.add("자바공부");

  for(String el:set){
   System.out.println(el);
  }

  set.clear();
  if(set.isEmpty()) System.out.println("비어 있음");

  System.out.println("=========");

  Collection<Integer> c=new ArrayList<Integer>();
  for(int i=0;i<10;i++) c.add(i);
  for(int i:c ) System.out.print(i+" ");
  System.out.println("\n=========");

  // 탐색중 제거
  Iterator<Integer> iter=c.iterator();

  while (iter.hasNext()){
   int i=iter.next();
   if(i%2==0) iter.remove();
  }
  for(int i:c ) System.out.print(i+" ");

 }//
}
