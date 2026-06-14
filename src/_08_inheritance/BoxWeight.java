package _08_inheritance;

public class BoxWeight extends Box{
    double weight;


    BoxWeight(){
        this.weight = -1;
//        this.l these says error bcz l is private in parent class (anything is private can only be used in that same class)
//        although sub-class includes the members of it's super-class it will not be able to access the members that are private
    }


    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }


    BoxWeight(double l, double w, double h, double weight){
        //super(l, w, h); //call the parent class constructor OR used to initialize values present in parent class
        this.weight = weight;

//        System.out.println(super.weight); //we can use super.weight incase there is variable named weight present in both the parent and child class
                                         //so using super means accessing parent weight and this means accessing child weight
    }


    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
