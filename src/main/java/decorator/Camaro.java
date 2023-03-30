package decorator;

public class Camaro implements Car{

    public float price;

    public Camaro() {
    }

    public Camaro(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String getAdditionalList() {
        return "Camaro";
    }


}
