package _10_encapsulation;

public class A {

    int num;
   private int x;
   private int y;
    String name;
    int[] arr;

    int getX(){
        return x = 111;
    }

    void setX(int x){
        this.x = x;
    }

    A(int num, int x, int y, String name){
        this.name = name;
        this.num = num;
        this.arr = new int[num];
//        this.arr = new int[]{1,2,3,4};
    }
}
