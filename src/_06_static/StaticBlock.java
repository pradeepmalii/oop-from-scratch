package _06_static;
//this is a demo to show initialization of static variable
public class StaticBlock {
    static int a = 4;
    static int  b;

    static { //this is STATIC INITIALIZATION BLOCK run only once when the class is loaded for the first time into memory
        System.out.println("I am inside static block");
        b = 5 * a;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b); //so as soon as the class StaticBlock is loaded everything inside class is declared like a is set to 4, b is set to 0, static block runs and that statement gets print then everything inside main gets excuted

        StaticBlock.b += 2;
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);
    }




}
