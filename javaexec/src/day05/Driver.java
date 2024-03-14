package day05;

public class Driver {

 // 매개변수의 다형성
 public void drive(Vehicle vehicle){

  // 객체타입확인
  if(vehicle instanceof Bus){
   Bus bus= (Bus) vehicle;
   bus.checkFare();
  }
   vehicle.run();
 }

 public static void main(String[] args) {
  Driver driver=new Driver();

  Bus bus=new Bus();
  Taxi taxi=new Taxi();

  driver.drive(bus);
  driver.drive(taxi);

  bus.checkFare();

  // 자동타입변환
  Vehicle vehicle=new Bus();
  vehicle.run();
  // vehicle.chechFare();

  Bus bus2=(Bus) vehicle; //강제타입변환
  bus2.checkFare();

 }  //

} //
