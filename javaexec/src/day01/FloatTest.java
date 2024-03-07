package day01;

public class FloatTest {
 public static void main(String[] args) {
  // 실수 리터럴
  float var1=3.14f;
  // float var2=3.14; 컴파일 에러
  float var2= 3.14F;
  double var3=3.14;

  // 논리타입
  boolean stop=true;
  boolean start=false;

  // 타입변환
  // 자동타입변환
  byte val=10;
  int val1=val;

  char 글자='가';
  val1=글자;

  float val2=글자;

  float val3=100.5F;
  double val4=val3;

  val1= (int) val4;
  System.out.println(val1);

  // 연산식에 형변환
  int 정수=10;
  int 결과=10/4 ;

  int 결과2= (int) (10/4.0);
  double 결과3= (10/4.0);

  System.out.println(결과2);  // 2
  System.out.println(결과3);  // 2.5

  int str=10+2+8;
  String str1="10"+2+8;
  String str2="10"+(2+8);
  System.out.println(str);
  System.out.println(str1);
  System.out.println(str2);

  // 문자열 ->기본타입을 강제변환
  String 문자="10";
  byte value=Byte.parseByte(문자);
  short valu2=Short.parseShort(문자);
  int value3=Integer.parseInt(문자);
  boolean value4=Boolean.parseBoolean("true");

  // 숫자->문자열로 변환
  Object num=100;
  String numStr=String.valueOf(num);

  String numStr2=num+"";

  //Object obj=new Integer(100);
  //System.out.println(typeof num);
  if(num instanceof Integer){
   System.out.println("정수입니다.");
  }else{
   System.out.println("정수가 아닙다.");
  }

  Integer num2=Integer.valueOf(200);

  Object str5="Welcome";

  Class<?> cls=str5.getClass();
  System.out.println("나는" + cls.getName() +"입니다.");

  Object str6=500;

  Class<?> cls2=str6.getClass();
  System.out.println("나는?" + cls2.getTypeName() +"입니다.");

 } //
} //
