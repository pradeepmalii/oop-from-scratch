package _08_inheritance;

public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box(4,2,2);
//        Box box2 = new Box(box1); //these copies the old box
//
//        System.out.println(box1.w + " " + box1.h );
//
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.h + " " + box3.weight);
//        System.out.println((box4.w + " " + box4.weight));
//
//
//
//        Box box5 = new BoxWeight(2,3,4,9);//here it has 4 values bcz BoxWeight constructor is initialized with 4 values
//        System.out.println(box5.w);//these works properly
//        System.out.println(box5.weight); these gives error bcz
        //it is type of the reference variable and not the type of object that determines what  members can be accessed
        //this is a reference type of box and it is referencing to an object of type BoxWeight
        //when a reference to a sub-class object is assigned to a super-class reference variable like in these example
        //you will only have access to only those part of the object that are obviously defined in the super-class



//        BoxWeight box6 = new Box(2);
//        System.out.println(box6);
//        there are many variables in both parent and child classes
//        you are given access to variables that are in the reference type i.e. BoxWeight
//        hence you should have access to weight variable
//        this also means, that the ones you are trying to access should be initialised
//        but here, when the obj itself is of type  parent class, how will you call the constructor of the child class
//        this is why error
//        so you can not have child reference variable and parent object



        BoxPrice box7 = new BoxPrice();
//        System.out.println(box7.h);
    }
}
