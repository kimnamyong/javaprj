package day10;

import java.util.ArrayList;

public class Student {

 int studentId;
 String studentName;

 ArrayList<Subject> subjectList;

 public Student(int studentId, String studentName) {
  this.studentId = studentId;
  this.studentName = studentName;
  subjectList=new ArrayList<Subject>();
 }

 public void addSubject(String name, int score) {
  Subject subject = new Subject();

  subject.setName(name);
  subject.setScorePoint(score);

  subjectList.add(subject);
 }

 public void showStudentInfo() {
  int total = 0;
  for(Subject s : subjectList) {
   total += s.getScorePoint();
   System.out.println(studentName + "학생의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다. ");
  }
  System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
 }

 public static void main(String[] args) {

  Student studentLee = new Student(1001, "Lee");
  studentLee.addSubject("국어", 100);
  studentLee.addSubject("수학", 50);

  Student studentKim = new Student(1002, "Kim");
  studentKim.addSubject("국어", 70);
  studentKim.addSubject("수학", 85);
  studentKim.addSubject("영어", 100);

  studentLee.showStudentInfo();

  System.out.println("==================");
  studentKim.showStudentInfo();

 }

}
