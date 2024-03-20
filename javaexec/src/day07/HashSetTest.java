package day07;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
 public static void main(String[] args) {
  Set<Member> set = new HashSet<>();

  set.add(new Member("홍길동", 30));
  set.add(new Member("홍길동", 30));

  System.out.println("총 객체수 : " + set.size());

  Member m1=new Member("강감찬",50);
  Member m2=new Member("강감찬",50);
  Member m3=new Member("강감찬",10);

  set.add(m1);
  set.add(m2);
  set.add(m3);
  System.out.println(m1==m2);
  System.out.println(m1==m3);
  System.out.println(m1.equals(m2));
  System.out.println(m1.equals(m3));

  System.out.println("총 객체수 : " + set.size());

  System.out.println(m1.hashCode());
  System.out.println(m2.hashCode());
  System.out.println(m3.hashCode());

  // 원래주소
  System.out.println(System.identityHashCode(m1));
  System.out.println(System.identityHashCode(m2));
  System.out.println(System.identityHashCode(m3));

 }
}

class Member {
 public String name;
 public int age;

 public Member(String name, int age) {
  this.name = name;
  this.age = age;
 }

 public boolean equals(Object obj) {
  if(obj instanceof Member) {
   Member member = (Member) obj;
   return member.name.equals(name) && (member.age==age) ;
  } else {
   return false;
  }
 }

 public int hashCode() {
  return name.hashCode() + age;
 }
}