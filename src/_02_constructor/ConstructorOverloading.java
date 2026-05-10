package _02_constructor;

//Using example of pizza to understand Constructor Overloading
public class ConstructorOverloading {

    String size;
    int toppings;
    boolean ExtraCheese;

    //constructor1
    ConstructorOverloading(){
        size = "Medium";
        toppings = 1;
        ExtraCheese = false;
    }

    //Constructor 2
    ConstructorOverloading(String size){
        this.size = size;
        toppings = 1;
        ExtraCheese = false;
    }

    //Constructor3
    ConstructorOverloading(String size, int toppings){
        this.size = size;
        this.toppings = toppings;
        ExtraCheese = false;
    }

    //Constructor4
    ConstructorOverloading(String size, int toppings, boolean ExtraCheese){
        this.size = size;
        this.toppings = toppings;
        this.ExtraCheese = ExtraCheese;
    }

    void display(){
        System.out.println("Size: "+ size);
        System.out.println("Toppings: "+ toppings);
        System.out.println("ExtraCheese: "+ ExtraCheese);
        System.out.println();
    }
}
