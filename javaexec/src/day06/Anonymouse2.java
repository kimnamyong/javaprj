package day06;

interface RemoteControl{
  void turnOn();
  void turnOff();
}

public class Anonymouse2 {
 // 필드 초기값으로 대입
 RemoteControl field=new RemoteControl() {
  @Override
  public void turnOn() {
   System.out.println("TV를 켭니다");
  }
  @Override
  public void turnOff() {
   System.out.println("TV를 끕니다");
  }
 };
 //람다식
// RemoteControl field2=()-> System.out.println("welcom");
// field2.turnOn();

 void method1(){
  // 로컬변수값으로 대입
  RemoteControl localVar=new RemoteControl() {
   @Override
   public void turnOn() {
    System.out.println("Audio를 켭니다");
   }
   @Override
   public void turnOff() {
    System.out.println("Audio를 off 합니다");
   }
  };
  localVar.turnOn();
 } //
 // 매개값 사용
 void method2(RemoteControl rc){
  rc.turnOn();
 }

 public static void main(String[] args) {
  Anonymouse2 anony=new Anonymouse2();
  anony.field.turnOn();
  anony.method1();
  anony.method2(new RemoteControl() {
   @Override
   public void turnOn() {
    System.out.println("SmartTV를 켭니다");
   }

   @Override
   public void turnOff() {
    System.out.println("SmartTV를 끕니다.");
   }
  });


 } //main end
} // end
