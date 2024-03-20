package day09;

import java.io.IOException;
import java.util.Scanner;

public class BoardServiceExample {
 public static void main(String[] args) throws IOException {

  Scanner scanner=new Scanner(System.in);
  BoardDAO dao=new BoardDAO();

  while (true){
   dao.getBoardList();

   int answer=Integer.parseInt(scanner.nextLine());

   if(answer==1){  // 새글작성
    dao.boardInsert();

   }else if(answer==2){  // 상세보기
    System.out.println("글번호 선택>>");
    int select =Integer.parseInt(scanner.nextLine());
    dao.boardDetail(select);

   }else if(answer==3){  // 수정하기
    System.out.println("수정할 글 번호 선택>>");
    int select =Integer.parseInt(scanner.nextLine());
    dao.boardUpdate(select);
   }else if(answer==4){
    System.out.println("삭제할 글 번호를 선택>>");
    int select =Integer.parseInt(scanner.nextLine());
    dao.boardDelete(select);
   }else if(answer==5){ // 파일 기능
    System.out.println("1.파일읽기, 2 파일쓰기[덮어쓰기]");
    answer=Integer.parseInt(scanner.nextLine());
    if(answer==1){
     dao.txtRead();
    }else if(answer==2){
     dao.txtWrite();
    }else{
     System.out.println("파일 처리 종료");
    }

   }else if(answer==6){
    break;
   }

  } // while
  System.out.println("게시판 프로그램이 종료되었습니다.");

 } // main
} // end
