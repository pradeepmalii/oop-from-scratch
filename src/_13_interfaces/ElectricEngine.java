package _13_interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start electric engine");
    }

    @Override
    public void stop() {
        System.out.println("stop electric engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerate electric engine");
    }

    @Override
    public void brake() {
        System.out.println("brake electric engine");

    }
}
