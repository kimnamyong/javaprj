package day06;

import java.util.Arrays;
import java.util.Comparator;

public class Data3 implements Comparable<Data3> {
 int a;

 public Data3(int a) {
  this.a = a;
 }

  @Override
 public int compareTo(Data3 data) {
  return Integer.compare(this.a, data.a);
 }

 @Override
 public String toString() {
  return "Data3{" +
          "a=" + a +
          '}';
 }

 public static void main(String[] args) {

  Data3[] a = new Data3[] { new Data3(3), new Data3(5), new Data3(1) };
  Arrays.sort(a);
  System.out.println(Arrays.toString(a));
 }


}
