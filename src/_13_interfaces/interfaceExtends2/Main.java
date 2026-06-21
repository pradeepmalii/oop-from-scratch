package _13_interfaces.interfaceExtends2;

public class Main implements A, B{


    @Override
    public void greet() {
        //the is public bcz greet() in B is public
        //so u can have public or something more free than that
        // not more restrict than that, and these goes for that access modifier
    }

    public static void main(String[] args) {
        Main obj = new Main();

    }
//    @Override
//    public void fun() {
//        A.super.fun();
//    }
}