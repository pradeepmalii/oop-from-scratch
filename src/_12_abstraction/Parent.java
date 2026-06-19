package _12_abstraction;

public abstract class Parent {

    int age;

    public Parent(int age) {   //this is a constructor in abstract class
        this.age = age;
    }

//    abstract Parent(){}  can not create abstract constructor in abstract class


    //do static method overridden -> no , then what is the point of creating abstract static method


    static void hello(){
        System.out.println("heyy");
    }

    void normal(){
        System.out.println("these is normal method");
    }


    abstract void career();
    abstract void partner();
}
