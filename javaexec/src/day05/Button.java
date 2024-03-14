package day05;

public class Button {

 OnClickListener listener;

 static interface OnClickListener {    // 중첩인터페이스
  void onClick(); // 오버라이딩
 }

 void setOnClickListener(OnClickListener listener) {
  this.listener = listener;
 }

 void touch() {
  listener.onClick();  // 구현 객체의 onclick() 메소드 호출
 }
} // Button

class MessListener implements Button.OnClickListener{

 @Override
 public void onClick() {
  System.out.println("메시지를 보낸다.");
 }
}

class CallListener implements Button.OnClickListener{
 @Override
 public void onClick() {
  System.out.println("전화를 건다");
 }

 public static void main(String[] args) {
  Button btn=new Button();

  btn.setOnClickListener(new CallListener());
  btn.touch();

  btn.setOnClickListener(new MessListener());
  btn.touch();
 }
}
