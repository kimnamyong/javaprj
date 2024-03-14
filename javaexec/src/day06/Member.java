package day06;

import java.util.Objects;

public class Member {
 String id;

 public Member(String id) {
  this.id = id;
 }

 @Override
 public boolean equals(Object obj) {
  if (obj instanceof Member) {
   Member member = (Member) obj;
   if (id.equals(member.id)) {
    return true;
   }
  }
  return false;
 }

 @Override
 public int hashCode() {
  return Objects.hash(id);
 // return id.hashCode();
 }

 @Override
 public String toString() {
  return "Member{" +
          "id='" + id + '\'' +
          '}';
 }

 public static void main(String[] args) {
   Member obj1=new Member("blue");
   Member obj2=new Member("blue");
   Member obj3=new Member("red");

  System.out.println(obj1.equals(obj2));
  System.out.println(obj1.equals(obj3));

  // 원래주소
  System.out.println(System.identityHashCode(obj1));
  System.out.println(System.identityHashCode(obj2));
  System.out.println(System.identityHashCode(obj3));
  // 재정의한 해시코드 주소
  System.out.println(obj1.hashCode()); // 3027034
  System.out.println(obj2.hashCode());  // 3027034
  System.out.println(obj3.hashCode());
  System.out.println("==========");
  System.out.println(obj1.toString());
  System.out.println(obj1.getClass());
  System.out.println(obj1.getClass().getName());
  System.out.println(Integer.toHexString(obj1.hashCode()));
  System.out.println(obj1.hashCode());


 }//

}//



