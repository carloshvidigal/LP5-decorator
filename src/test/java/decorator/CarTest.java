package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void shouldGetCarPrice() {
        Car car = new Camaro(30000.0f);

        assertEquals(30000.0f, car.getPrice());
    }

    @Test
    void shouldGetCarPriceWithAirConditioner() {
        Car car = new AirConditioner(new Camaro(30000.0f));

        assertEquals(35000.0f, car.getPrice());
    }

    @Test
    void shouldGetCarPriceWithSportiveWheels() {
        Car car = new SportiveWheels(new Camaro(30000.0f));

        assertEquals(32650.0f, car.getPrice());
    }

    @Test
    void shouldGetCarPriceWithMetallicPainting() {
        Car car = new MetallicPainting(new Camaro(30000.0f));

        assertEquals(31900.0f, car.getPrice());
    }

    @Test
    void shouldGetCarPriceWithAirConditionerPlusWheels() {
        Car car = new SportiveWheels(new AirConditioner(new Camaro(30000.0f)));

        assertEquals(37650.0f, car.getPrice());
    }

    @Test
    void shouldGetCarPriceWithAirConditionerPlusMetallicPainting() {
        Car car = new MetallicPainting(new AirConditioner(new Camaro(30000.0f)));

        assertEquals(36900.0f, car.getPrice());
    }

    @Test
    void shouldGetCarPriceWithAirConditionerPlusMetallicPaintingPlusSportiveWheels() {
        Car car = new SportiveWheels(new MetallicPainting(new AirConditioner(new Camaro(30000.0f))));

        assertEquals(39550.0f, car.getPrice());
    }


    @Test
    void shouldReturnJustTheCar () {
        Car car = new Camaro();

        assertEquals("Camaro",  car.getAdditionalList());
    }

    @Test
    void shouldReturnAdditionalListWithAirConditioner () {
        Car car = new AirConditioner(new Camaro());

        assertEquals("Camaro/Ar Condicionado",  car.getAdditionalList());
    }

    @Test
    void shouldReturnAdditionalListWithMetallicPainting () {
        Car car = new MetallicPainting(new Camaro());

        assertEquals("Camaro/Pintura Metálica",  car.getAdditionalList());
    }

    @Test
    void shouldReturnAdditionalListWithSportiveWheels () {
        Car car = new SportiveWheels(new Camaro());

        assertEquals("Camaro/Rodas esportivas",  car.getAdditionalList());
    }

    @Test
    void shouldReturnAdditionalListWithSportiveWheelsPlusAirConditioner () {
        Car car = new AirConditioner(new SportiveWheels(new Camaro()));

        assertEquals("Camaro/Rodas esportivas/Ar Condicionado",  car.getAdditionalList());
    }

    @Test
    void shouldReturnAdditionalListWithSportiveWheelsPlusMetallicPainting() {
        Car car = new MetallicPainting(new SportiveWheels(new Camaro()));

        assertEquals("Camaro/Rodas esportivas/Pintura Metálica",  car.getAdditionalList());
    }

    @Test
    void shouldReturnAdditionalListWithSportiveWheelsPlusMetallicPaintingPlusAirConditioner() {
        Car car = new AirConditioner(new MetallicPainting(new SportiveWheels(new Camaro())));

        assertEquals("Camaro/Rodas esportivas/Pintura Metálica/Ar Condicionado",  car.getAdditionalList());
    }














}
