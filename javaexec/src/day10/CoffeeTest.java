package day10;

public class CoffeeTest {
 public static void main(String[] args) {
   Person kim=new Person("Kim",10000);
   Person lee=new Person("Lee",20000);

   StarCoffee starCoffe=new StarCoffee();
   BeanCoffee beanCoffe=new BeanCoffee();

   kim.스타커피사기(starCoffe,Menu.STARAMERICANO);
   lee.콩커피사기(beanCoffe,Menu.BEANLATTE);

  kim.스타커피사기(starCoffe,Menu.STARLATTE);
  lee.콩커피사기(beanCoffe,Menu.BEANAMERICANO);

  kim.스타커피사기(starCoffe,Menu.STARLATTE);
  lee.콩커피사기(beanCoffe,Menu.BEANAMERICANO);

  kim.money=5000;
  kim.스타커피사기(starCoffe,Menu.STARLATTE);
  lee.콩커피사기(beanCoffe,Menu.BEANAMERICANO);

 }
}
