package _06_static;

public class InnerClasses {
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Pradeep");
        Test b = new Test("deep");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
