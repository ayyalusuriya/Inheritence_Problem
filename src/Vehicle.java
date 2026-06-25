public class Vehicle {

    void start(){
        System.out.println("Start the the VEhicle");
    }

    static class Engine extends Vehicle{
        void engine(){
            System.out.println("Engine started");
        }
    }
    public static void main(String[] args) {
        Engine e = new Engine();
        e.engine();
        e.start();

    }
}
