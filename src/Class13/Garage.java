package Class13;

public class Garage {
    public static void main(String[] args) {

         Car car1=new Car();
         car1.numberOFDoors=4;
         car1.color="Black";
         car1.size=4;
         car1.make="BMW";
         car1.model="i8";

         Car car2=new Car();
         car2.numberOFDoors=2;
         car2.color="blue";
         car2.size=2;
         car2.make="lamborghini";
         car2.model="Gallardo";

        Car car3=new Car();
        car3.numberOFDoors=3;
        car3.color="red";
        car3.size=3;
        car3.make="lambor";
        car3.model="Gall";

        System.out.println("car 1 .make "+car1.make);
        System.out.println("car 2 make  " +car2.make);
        System.out.println("car 3 maek  " + car3.make);
    }
}
