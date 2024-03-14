package day06;

// 익명자식객체
public class Anonymous {
 // 필드초기값으로 대입
   Person field= new Person(){
    void work(){
     System.out.println("출근합니다.");
    }
   @Override
   void wake() {
    System.out.println("6시에 일어납니다.");
    work();
   }
  };

 void method1(){
   // 로컬변수에 대입
  Person localVar=new Person(){
    void walk(){
     System.out.println("산책합니다.");
    }

   @Override
   void wake() {
    System.out.println("8시에 일어납니다.");
    walk();
   }
  };
  localVar.wake();
 }

 void method2(Person person){
  person.wake();
 }

 public static void main(String[] args) {
  Anonymous anonymous=new Anonymous();
  anonymous.field.wake();
  //anonymous.field.work();
  anonymous.method1();
  Person p = new Person();
  anonymous.method2(p);

  // 익명 객체 매개값 사용
  anonymous.method2(new Person(){
    void study(){
     System.out.println("공부합니다.");
    }

   @Override
   void wake() {
    System.out.println("9시에 일어납니다.");
    study();
   }
  });

 }
}

