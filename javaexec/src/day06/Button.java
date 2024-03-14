package day06;

public class Button {
 OnClickListener listener;

 void setOnClickListener(OnClickListener listener){
  this.listener=listener;
 }

 void touch(){
  listener.onClick();
 }

 // 중첩인터페이스
 interface OnClickListener{
   void onClick();
 }
}
