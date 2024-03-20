package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
 public static void main(String[] args) {
  // 생성
  Map<String,Integer> map=new HashMap<String, Integer>();

  // 저장
  map.put("강감찬",80);
  map.put("이순신",50);
  map.put("원균",30);
  map.put("장보고",70);
  map.put("강감찬",95);

  System.out.println("등록수: " + map.size()+"명");

  // 찾기
  System.out.println("강감찬 나이: "+ map.get("강감찬"));

  // 객체를 하나씩 처리
  Set<String> keySet=map.keySet(); // key set
  Iterator<String> keyIterator=keySet.iterator(); // 반복자

  while (keyIterator.hasNext()){
   String key=keyIterator.next();
   Integer value=map.get(key);
   System.out.println(key+":"+ value);
  }
  // 삭제
  map.remove("원균");
  System.out.println("등록수: " + map.size()+"명");

  // key value ->Map entry set
  Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
 Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();

 while (entryIterator.hasNext()){
  Map.Entry<String,Integer> entry=entryIterator.next();
  String key=entry.getKey();
  Integer value=entry.getValue();
  System.out.print(key+":"+ value);
 }

  System.out.println();



 } //
} //
