package _10_encapsulation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10,30, 100 ,"Deep");

        System.out.println(Arrays.toString(obj.arr));

        //need to do few things
        //1. access the data members
        //2. modify the data members

        obj.num = 12;
        System.out.println(obj.num);

//        obj.y = 33;

        System.out.println(obj.getX());

        int n = obj.num;

    }
}
