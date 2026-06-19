package _12_abstraction;

public class Son extends Parent{

    Son(int age)
    {
        super(10);
        this.age = age;
    }

    @Override
    void normal(){
        super.normal();
    }



    @Override
    void career()
    {
        System.out.println("I am going to be coder");
    }

    @Override
    void partner()
    {
        System.out.println("I love Sima");
    }


}
