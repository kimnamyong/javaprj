package day03;

public class BloodTypeTest {
 public static void main(String[] args) {
  Person p1 = new Person("홍길동", 18, BloodType.AB);
  Person p2 = new Person("전우치", 24, BloodType.O);

  //BloodType b1=new BloodType();


  BloodType blood1 = BloodType.valueOf("AB");
  BloodType blood2 = BloodType.valueOf("A");
  System.out.println(blood1.canGiveTo(blood2));// false
  System.out.println(blood2.canGiveTo(blood1)); // true

  for (BloodType blood : BloodType.values())
   System.out.println(blood); // A B O AB

  String s = "";
  if (p1.getBloodType() == BloodType.A) s = "A형";
  else if (p1.getBloodType() == BloodType.B) s = "B형";
  else if (p1.getBloodType() == BloodType.AB) s = "AB형";
  else if (p1.getBloodType() == BloodType.O) s = "O형";
  System.out.println(s);

 }
}
