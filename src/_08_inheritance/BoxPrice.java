package _08_inheritance;

// this is MULTI-LEVEL INHERITANCE
//after these multiple inheritance comes which is not supported in java(one class inherite/extends more than one class) x   but we can achieve it's functionality using interfaces
//then hierarchical inheritance means one class is inherited by many classes (all concepts are same as single inheritance)
//then comes hybrid inheritance(combination of single and multiple inheritance) not supported in java but we can achieve it's functionality using interfaces
public class BoxPrice extends BoxWeight{
    double cost;


    BoxPrice(){
        super();
        this.cost = -1;
    }


    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }


    BoxPrice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }


    BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }
}
