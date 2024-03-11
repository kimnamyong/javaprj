package day03;

import java.util.Calendar;

public class EnumTest {
 public static void main(String[] args) {
  Week today=null;

  Calendar cal=Calendar.getInstance(); // 싱글톤 패턴

  int week=cal.get(Calendar.DAY_OF_WEEK); // 1~7

  System.out.println(week); // 2 ->월요일

  switch (week){
   case 1:
    today=Week.SUNDAY; break;
   case 2:
    today=Week.MONDAY; break;
   case 3:
    today=Week.TUESDAY; break;
   case 4:
    today=Week.WEDNESDAY; break;
   case 5:
    today=Week.THURSDAY; break;
   case 6:
    today=Week.FRIDAY; break;
   case 7:
    today=Week.SATURDAY; break;
  }

  System.out.println("오늘은 무슨요일? :" + today);
 }
}
