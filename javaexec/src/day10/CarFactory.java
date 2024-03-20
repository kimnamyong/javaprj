package day10;

public class CarFactory {

 private static CarFactory instance=new CarFactory();

 private CarFactory() { }

 public static CarFactory getInstance(){
  if(instance ==null)
      instance=new CarFactory();
      return instance;
 }

 public Car createCar(){
  Car car=new Car();
  System.out.println("자동차가 생산되었습니다.");
  return car;
 }


}//
