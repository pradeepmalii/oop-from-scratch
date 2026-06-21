package _13_interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Engine car = new Car(); you can put reference type as interface type
//        car.notBrake(); but then you won't be able to access methods of another interface
//        car.a; you won't be able to access variable of the class where interface has been
//                 implemented (car implements)

//        car.acc();
//        car.stop();
//        car.brake();

//        NiceCar car = new NiceCar(); these is no argument object
         NiceCar car = new NiceCar(new ElectricEngine()); //these takes argument

         car.start();
         car.startMusic();
//         car.upgradeEngine();
         car.start();

    }
}
