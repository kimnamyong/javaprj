package day02;

public class ArrayCopyByForExample {
 public static void main(String[] args) {
  int[] oldIntArray = { 1, 2, 3 };
  int[] newIntArray = new int[5];

  for(int i=0; i<oldIntArray.length; i++) {
   newIntArray[i] = oldIntArray[i];
  }

  for(int i=0; i<newIntArray.length; i++) {
   System.out.print(newIntArray[i] + ", ");
  }

  String[] oldStrArray = { "java", "array", "copy" };
  String[] newStrArray = new String[5];

  System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);

  for(int i=0; i<newStrArray.length; i++) {
   System.out.print(newStrArray[i] + ", ");
  }

  // 향상된 for문
  int[] scores = { 95, 71, 84, 93, 87 };

  int sum = 0;
  for (int score : scores) {
   sum = sum + score;
  }
  System.out.println("점수 총합 = " + sum);

  double avg = (double) sum / scores.length;
  System.out.println("점수 평균 = " + avg);
 }
}
