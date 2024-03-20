package day10;

public class Car {
 private static int serialNum=10;
 private int carNum;

 public Car() {
  ++serialNum;
  this.carNum = serialNum;
 }

 public int getCarNum() {
  return carNum;
 }

}
