package day03;

public class Student {

 // 필드-멤버변수,
 String studentNo;
 String studenName;
 int studentAge;

 // 생성자함수
 // 기본생성자함수
 public Student() {
 }


 public Student(String studentNo, String studenName, int studentAge) {
  this.studentNo = studentNo;
  this.studenName = studenName;
  this.studentAge = studentAge;
 }

 // 멤버 메소드
 // get, setter 메소드
 public String getStudentNo() {
  return studentNo;
 }

 public void setStudentNo(String studentNo) {
  this.studentNo = studentNo;
 }

 public String getStudenName() {
  return studenName;
 }

 public void setStudenName(String studenName) {
  this.studenName = studenName;
 }

 public int getStudentAge() {
  return studentAge;
 }

 public void setStudentAge(int studentAge) {
  this.studentAge = studentAge;
 }

 @Override
 public String toString() {
  return "Student{" +
          "studentNo='" + studentNo + '\'' +
          ", studenName='" + studenName + '\'' +
          ", studentAge=" + studentAge +
          '}';
 }

} // end