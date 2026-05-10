package _02_constructor;

public class Constructor {
    public static void main(String[] args) {

        //constructor calling
        StudentClass student1 = new StudentClass(5,"Pradeep",100); //from new till end statement calls the constructor
        System.out.println(student1.roll);

        //constructor Overloading
        ConstructorOverloading pizza1 = new ConstructorOverloading();

        ConstructorOverloading pizza2 = new ConstructorOverloading("small");

        ConstructorOverloading pizza3 = new ConstructorOverloading("Large", 5);

        ConstructorOverloading pizza4 = new ConstructorOverloading("Medium", 3, true);

        pizza1.display();
        pizza2.display();
        pizza3.display();
        pizza4.display();


        //constructor chaining
        ConstructorChaining mobile1 = new ConstructorChaining("Vivo", 15000);

        ConstructorChaining mobile2 = new ConstructorChaining();

        mobile1.display();
        mobile2.display();
    }
}
