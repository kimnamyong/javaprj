package day02;



public class Test02 {
 static String[] split1(String s) {

  String[] words = s.split(",");

  for(int i=0;i<words.length; i++){
   words[i]=words[i].replace(" ","");
  }
  return words;

 }

 static String[] split2(String s) {
  String[] words = s.split(",");
  for(int i=0;i<words.length; i++){
   words[i]=words[i].trim();
  }
  return words;
 }

 public static void main(String[] args) {
  String s = "One, Two ,Three , Four,Five";
  String[] a1 = split1(s);
  for (String t : a1)
   System.out.printf("[%s]\n", t);

  String[] a2 = split2(s);
  for (String t : a2)
   System.out.printf("[%s]\n", t);
 }

}
