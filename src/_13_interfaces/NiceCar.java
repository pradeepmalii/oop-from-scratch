package _13_interfaces;

public class NiceCar {
    private Engine engine;  //declare reference variable value initially  null
    private Media player= new CDPlayer(); // Declares and initializes the reference variable.
                                         // where obj is class CDPlayer();

    public NiceCar(){
        engine = new PowerEngine(); //No-argument constructor. Assigns a class PowerEngine as power engine
                                   //implement interface Engine(reference obj above)
    }

    public NiceCar(Engine engine){
        this.engine = engine;  //Parameterized constructor. Allows any Engine implementation to be supplied.
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void stopMusic(){
        player.start();
    }

    public void startMusic(){
        player.start();
    }

    public void upgradeEngine(){  //Normal method, not a constructor.
        this.engine = new ElectricEngine(); // Changes the current engine reference to a new ElectricEngine object.
    }
}
