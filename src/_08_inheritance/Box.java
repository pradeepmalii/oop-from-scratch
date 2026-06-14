package _08_inheritance;

public class Box {
   private double l;
    double h;
    double w;
//    double weight;


    Box(){
        System.out.println("default constructor");
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        super();
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double w, double h){
        System.out.println("parameterized constructor");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
