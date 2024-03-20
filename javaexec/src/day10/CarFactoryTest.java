package day10;

public class CarFactoryTest {
 public static void main(String[] args) {
  CarFactory factory=CarFactory.getInstance();

  Car 소나타=factory.createCar();
  Car 그랜져=factory.createCar();
  Car 그랜져2=factory.createCar();

  System.out.println(소나타.getCarNum()); //10001 출력
  System.out.println(그랜져.getCarNum()); //10002 출력
  System.out.println(그랜져2.getCarNum()); //10002 출력


 }
}
