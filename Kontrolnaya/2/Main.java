import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Green", 100, "Mech", 10000);
        /*
        car1.accelerate(10);
        car1.accelerate(-10);
        car1.stop();
        car1.start();
        car1.accelerate(110);
        car1.accelerate(-150);*/
        BMW car2 = new BMW("Black", 150, "Auto", 25000, "X6M");
        Volvo car3 = new Volvo("Green", 200, "Auto", 30000,"XC90");
        MB car4 = new MB("Black", 250, "Auto", 58220, "Maybach");
        MB car5 = new MB("White", 220, "Auto", 48520, "GL400");
        MB car6 = new MB("Blue", 220, "Auto", 48520, "E300");
        }
}
