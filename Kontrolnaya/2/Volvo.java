public class Volvo extends Car{

    String model;
    public Ford(String color, int maxSpeed, String transmission, int price) {
        super(color, maxSpeed, transmission, price);
        this.model = "Volvo";
    }
    public Ford(String color, int maxSpeed, String transmission, int price, String model) {
        super(color, maxSpeed, transmission, price);
        this.model = "Volvo " + model;
    }
    @Override
    public String getModel(){
        return this.model;
    }
}
