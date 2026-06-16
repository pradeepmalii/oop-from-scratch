package _09_polymorphism;

public class Shapes {
     void area() {
        System.out.println("I am in area");

    }

        int a = 10;
        int b = 20;

    void secondArea(){
            System.out.println("these is second area");
        }

}


//final void area() {
//    System.out.println("I am in area");

// //early binding: these reduces these overhead of JVM and it  does not need to perform dynamic method dispatch for that method.
//Instead, it can often resolve the call directly.No need to search for overridden implementations.
