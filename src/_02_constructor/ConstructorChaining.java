package _02_constructor;

public class ConstructorChaining {
    String MobileBrand;
    int Price;

    //calling constructor using another constructor called as constructor chaining
    ConstructorChaining(){
        this("OPPO", 12000);

    }

    ConstructorChaining(String MobileBrand, int Price){
        this.MobileBrand = MobileBrand;
        this.Price = Price;
    }





    void display(){
        System.out.println("Mobile brand: "+ MobileBrand);
        System.out.println("Price: "+ Price);
        System.out.println();
    }
}
