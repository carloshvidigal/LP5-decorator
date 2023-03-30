package decorator;

public class MetallicPainting extends CarDecorator{

    public MetallicPainting(Car car) {
        super(car);
    }

    public float getAdditionalPrice() {
        return 1900.0f;
    }

    public String getAdditionalName() {
        return "Pintura Metálica";
    }
}
