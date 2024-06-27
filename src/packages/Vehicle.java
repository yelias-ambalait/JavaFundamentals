package packages;

public class Vehicle {

    public static void run(){
        System.out.println("Vehicle runs");
    }

    public void stop(){
        System.out.println("Vehicle stops");
    }

}

class Bus {

    public static void test(){
        Vehicle.run();
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.stop();
        Bus.test();
    }
}
