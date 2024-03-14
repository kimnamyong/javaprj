package day05;

public class Main {

 public static void main(String[] args) {

  // 지역변수,로컬변수
   int count=0;

   // 로컬클래스
   class Local{
     public void increment(){
      //count++;
     }
   } //
    Local local=new Local();
    local.increment();
    System.out.println(count);
 }
}
