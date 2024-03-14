package day06;

public class Example4 {

 int a = 3, b = 4;

 void doSomethoing() {
  new InnerClass().swap();
  System.out.printf("%d %d\n", a, b);
 }

 public class InnerClass {
  public void swap() {
   int temp = a;
   a = b;
   b = temp;
  }
 }

 public static void main(String[] args) {
  new Example4().doSomethoing();
 }
}
