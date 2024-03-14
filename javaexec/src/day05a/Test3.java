package day05a;
import java.lang.Integer;

interface AAA{
 int abc(String str);
}

public class Test3 {
 public static void main(String[] args) {
  AAA a =new AAA() {
   @Override
   public int abc(String str) {
    return Integer.parseInt(str);
   }
  };

  System.out.println(a.abc("1200"));

// A a2=Integer::parseInt;
//
//  System.out.println(a2.abc("1200"));

 }
}
