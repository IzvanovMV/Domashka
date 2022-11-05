public class BMW extends Car{
    String model;
    int accSpeed;

    public BMW(String color, int maxSpeed, String transmission, int price) {
        super(color, maxSpeed, transmission, price);
        this.model = "BMW";
        this.accSpeed = 6;
    }
    public BMW(String color, int maxSpeed, String transmission, int price, String model) {
        super(color, maxSpeed, transmission, price);
        this.model = "BMW " + model;
        this.accSpeed = 6;
    }

    public BMW(String color, int maxSpeed, String transmission, int price, String model, int accSpeed) {
        super(color, maxSpeed, transmission, price);
        this.model = "BMW " + model;
        this.accSpeed = accSpeed;
    }

    @Override
    public String getModel(){
        return this.model;
    }

    public int getAccSpeed() {
        return accSpeed;
    }
}
