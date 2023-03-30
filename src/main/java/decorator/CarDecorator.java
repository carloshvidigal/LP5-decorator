package decorator;

public abstract class CarDecorator implements Car{

    private Car car;
    private String additional;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public abstract float getAdditionalPrice();

    public float getPrice(){
        return this.car.getPrice() + getAdditionalPrice();
    }

    public abstract String getAdditionalName();

    public String getAdditionalList() {
        return this.car.getAdditionalList() + "/" + this.getAdditionalName();
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
