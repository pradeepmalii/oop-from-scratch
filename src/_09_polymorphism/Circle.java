package _09_polymorphism;

public class Circle extends Shapes{
//    @Override //this is called annotation used to check if method is being overridden or not
    void area(){
        System.out.println("area is pi * r * r");
    }
}
//circle class is overriding the shape class both have the same method name area the but body inside the area is different