package _12_abstraction;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(23);
        son.career();


        Daughter daughter = new Daughter(22);
        daughter.career();


//        Parent parent = new Parent(); can not create obj of abstract class


        Parent.hello();
        Son.hello();
        son.normal();
    }
}
