package day03;

public class Board {

 String title;
 String content;
 String name;
 String date;
 int hitCount;

 public Board(String title, String content) {
  this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
 }

 public Board(String title, String content, String name) {
 }

 public Board(String title, String content, String name, String date) {
 }

 public Board(String title, String content, String name, String date, int i) {
  this.title = title;
  this.content = content;
  this.name = name;
  this.date = date;
  this.hitCount = i;
 }

 @Override
 public String toString() {
  return "Board{" +
          "title='" + title + '\'' +
          ", content='" + content + '\'' +
          ", name='" + name + '\'' +
          ", date='" + date + '\'' +
          ", hitCount=" + hitCount +
          '}';
 }

 public static void main(String[] args) {

  Board board1 = new Board("제목", "내용");
  Board board2 = new Board("제목", "내용", "홍길동");
  Board board3 = new Board("제목", "내용", "홍길동", "2025-12-31");
  Board board4 = new Board("코딩테스트", "자바코딩", "홍길동", "2025-12-31", 0);
  System.out.println(board4);
  System.out.println(board1);

 }
}
