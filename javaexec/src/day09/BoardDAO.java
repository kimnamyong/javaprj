package day09;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {

 Scanner scanner = new Scanner(System.in);
 List<BoardVO> boardList = new ArrayList<>();

 public void getBoardList() {
  System.out.println("<<게시판>>");
  System.out.println("번호   제목               작성자              작성일");
  System.out.println("--------------------------------");

  if(boardList.isEmpty()){
   System.out.println("현재 게시글이 없습니다.");

  }else{
   for(BoardVO vo : boardList){
    System.out.printf("%-3d | %-15s | %3s | %-1s\n",boardList.indexOf(vo)+1, vo.getTitle(), vo.getWriter(), vo.getRegisDate());
   }
  }
  System.out.println("----------------------");
  System.out.println("1.새글작성 | 2.상세보기 |3.글수정 | 4.글삭제| 5.파일 | 6.종료");

 }

 public void boardInsert() {
  BoardVO vo=new BoardVO();

  System.out.println("글제목: " );
  String title=scanner.nextLine();

  System.out.println("작성자: " );
  String writer=scanner.nextLine();

  System.out.println("글내용: " );
  String content=scanner.nextLine();

  vo.setNum(boardList.indexOf(vo)); // 자동증가, 0, 1, 2,3
  vo.setTitle(title);
  vo.setWriter(writer);
  vo.setContent(content);

  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  String registDate=sdf.format(new Date());
  vo.setRegisDate(registDate);

  boardList.add(vo);

  System.out.println("새글이 추가되었습니다.");
 }


 public void boardDetail(int select) {
  if(boardList.isEmpty()) {
   System.out.println("게시글이 없습니다.");
   return;
  }

  BoardVO vo=new BoardVO();
  vo=boardList.get(select - 1);

  System.out.println("No. " + select);
  System.out.println("제목 : " + vo.getTitle());
  System.out.println("작성자: " + vo.getWriter());
  System.out.println("--------------------------------");
  System.out.println("글내용: " + vo.getContent());
  System.out.println("--------------------------------");
  System.out.println("1.수정, 2 삭제  3 목록");

  select=Integer.parseInt(scanner.nextLine());

  if(select==1){  // 현재글 수정
   boardUpdate(boardList.indexOf(vo)+1);

  }else if(select==2){ // 현재글 삭제
   boardDelete(boardList.indexOf(vo)+1);

  }else if(select==3){ // 목록으로 이동
   return;
  }

 }

 public void boardUpdate(int select) {
  if(boardList.isEmpty()) {
   System.out.println("게시글이 없습니다.");
   return;
  }
  BoardVO vo=new BoardVO();
  vo=boardList.get(select - 1);

  System.out.println("글제목 : ");
  String title=scanner.nextLine();
  vo.setTitle(title);


  System.out.println("작성자 : ");
  String writer=scanner.nextLine();

  vo.setWriter(writer);

  System.out.println("글내용 : ");
  String content=scanner.nextLine();
  vo.setContent(content);

  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
  String registDate=sdf.format(new Date());
  vo.setRegisDate(registDate);

  boardList.set(boardList.indexOf(vo),vo);
  System.out.println("글 수정이 되었습니다.");

 }

 public void boardDelete(int select) {
  if(boardList.isEmpty()) {
   System.out.println("게시글이 없습니다.");
   return;
  }

  BoardVO vo=new BoardVO();
  vo=boardList.get(select - 1) ;

  boardList.remove(boardList.indexOf(vo));

  System.out.println(select+"번 글이 삭제되었습니다.");
 }


 public void txtWrite() throws IOException {

  Writer writer=new FileWriter("D:/temp/BoardDB.txt");
  String[] data=new String[10000];

  for(int i=0;i<boardList.size();i++){

   BoardVO vo=boardList.get(i);
   data[i]=boardList.indexOf(vo)+" "+ vo.getTitle()+" "+ vo.getContent()+" "+ vo.getWriter()+ " "+ vo.getRegisDate()+ " \n";
   writer.write(data[i]);

  }
  writer.flush();
  writer.close();
  System.out.println("파일로 저장 완료");
 }


 public void txtRead() throws IOException {
  Reader reader=new FileReader("D:/temp/BoardDB.txt");

  while (true){
   int data=reader.read();
   if(data==-1) break;
   System.out.println((char)data);
  }
  reader.close();
  System.out.println("파일 데이터 로드 완료");

 }


} // end
