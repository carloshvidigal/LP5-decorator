package decorator;

public class SportiveWheels extends CarDecorator{

    public SportiveWheels(Car car) {
        super(car);
    }

    public float getAdditionalPrice() {
        return 2650.0f;
    }

    public String getAdditionalName() {
        return "Rodas esportivas";
    }
}
