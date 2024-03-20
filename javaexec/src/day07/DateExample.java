package day07;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
 public static void main(String[] args) {
//  Date now = new Date();
//  String strNow1 = now.toString();
//  System.out.println(strNow1);
//
//  SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//  String strNow2 = sdf.format(now);
//  System.out.println(strNow2);

//  Calendar now = Calendar.getInstance();// 싱글톤패턴
//
//  int year = now.get(Calendar.YEAR);
//  int month = now.get(Calendar.MONTH) + 1;
//  int day = now.get(Calendar.DAY_OF_MONTH);
//
//  int week = now.get(Calendar.DAY_OF_WEEK);
//
//  String strWeek = null;
//  switch (week) {
//   case Calendar.MONDAY:
//    strWeek = "월";
//    break;
//   case Calendar.TUESDAY:
//    strWeek = "화";
//    break;
//   case Calendar.WEDNESDAY:
//    strWeek = "수";
//    break;
//   case Calendar.THURSDAY:
//    strWeek = "목";
//    break;
//   case Calendar.FRIDAY:
//    strWeek = "금";
//    break;
//   case Calendar.SATURDAY:
//    strWeek = "토";
//    break;
//   default:
//    strWeek = "일";
//  }
//
//  int amPm = now.get(Calendar.AM_PM);
//
//  String strAmPm = null;
//  if (amPm == Calendar.AM) {
//   strAmPm = "오전";
//  } else {
//   strAmPm = "오후";
//  }
//
//  int hour = now.get(Calendar.HOUR);
//  int minute = now.get(Calendar.MINUTE);
//  int second = now.get(Calendar.SECOND);
//
//  System.out.print(year + "년 ");
//  System.out.print(month + "월 ");
//  System.out.println(day + "일 ");
//  System.out.print(strWeek + "요일 ");
//  System.out.println(strAmPm + " ");
//  System.out.print(hour + "시 ");
//  System.out.print(minute + "분 ");
//  System.out.println(second + "초 ");

//  Date now = new Date();
//
//  SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
//  System.out.println( sdf.format(now) );

  Calendar now = Calendar.getInstance();

  int year = now.get(Calendar.YEAR);

  int month = now.get(Calendar.MONTH) + 1;
  String strMonth = (month<10)? ("0"+month) : (""+month);

  int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
  String strDayOfMonth = (dayOfMonth<10)? ("0"+dayOfMonth) : (""+dayOfMonth);

  String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
  int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
  String strDayOfWeek = dayArray[dayOfWeek-1] + "요일";

  int hour = now.get(Calendar.HOUR_OF_DAY);
  String strHour = (hour<10)? ("0"+hour) : (""+hour);

  int second = now.get(Calendar.SECOND);
  String strSecond = (second<10)? ("0"+second) : (""+second);

  System.out.print(year + "년 ");
  System.out.print(strMonth + "월 ");
  System.out.print(strDayOfMonth + "일 ");
  System.out.print(strDayOfWeek + " ");
  System.out.print(strHour + "시 ");
  System.out.print(strSecond + "분 ");

 }
}
