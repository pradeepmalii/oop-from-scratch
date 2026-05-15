package _06_static;

public class Main {
    public static void main(String[] args) {
        Human Pradeep = new Human(22, "Pradeep", 10000, false);
        Human Deep = new Human(42, "Deep", 50000, true);
        Human Arpit = new Human(23, "Arpit", 20202, false);

        System.out.println(Deep.married);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

//        message(); these gives error bcz static method can not access non-static data

    }

    static void fun(){
        //message(); you can not use this because it requires an instance
        //but the function we are using it in does not depend an instance
        //in simple terms fun() does not depend on object then how can you use something inside it which depends on objects

        //now you can access the non static stuff by refering their instances/object in static context
        Main obj = new Main();
        obj.message();
    }

     //we know something which is not static belongs to an object
     void message(){
        System.out.println("How's going");

        fun(); //you can access static stuff in non-static method
    }


}
