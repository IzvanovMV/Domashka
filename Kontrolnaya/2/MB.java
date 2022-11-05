public class MB extends Car{
    String model;
    int fuelConsumption;

    public MB(String color, int maxSpeed, String transmission, int price) {
        super(color, maxSpeed, transmission, price);
        this.model = "MB";
        this.fuelConsumption = 2;
    }
    public MB(String color, int maxSpeed, String transmission, int price, String model) {
        super(color, maxSpeed, transmission, price);
        this.model = "MB " + model;
        this.fuelConsumption = 4;
    }
    public MB(String color, int maxSpeed, String transmission, int price, String model, int fuelConsumption) {
        super(color, maxSpeed, transmission, price);
        this.model = "MB " + model;
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public String getModel(){
        return this.model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
