package day05a;

interface AA{
 double abc(int k);
}
class BB{
 double bcd(int k){
  return k*0.1;
 }
}

public class Test22 {
 public static void main(String[] args) {

  AA a=new AA() {
   @Override
   public double abc(int k) {
    BB b=new BB();
    return b.bcd(k);
   }
  };
  System.out.println(a.abc(500));

  // 인스턴스 메소드를 참조하는 람다식
  BB b=new BB();
  AA a2=b::bcd;
  System.out.println(a2.abc(333));
 }
}
