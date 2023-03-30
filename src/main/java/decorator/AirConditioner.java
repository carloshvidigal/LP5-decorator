package decorator;

public class AirConditioner extends CarDecorator {

    public AirConditioner(Car car) {
        super(car);
    }

    public float getAdditionalPrice() {
        return 5000.0f;
    }

    public String getAdditionalName() {
        return "Ar Condicionado";
    }
}
