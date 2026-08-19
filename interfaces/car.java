package interfaces;

public class car implements vehicle {
   
    @Override
    public void start() {

        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

}
