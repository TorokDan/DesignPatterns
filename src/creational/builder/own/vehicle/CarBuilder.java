package creational.builder.own.vehicle;

import creational.builder.own.engine.Engine;

public class CarBuilder {

  private String plate;
  private Engine engine;

  private Car car;

  public CarBuilder withPlate(String plate) {
    this.plate = plate;
    return this;
  }

  public CarBuilder withEngine(Engine engine) {
    this.engine = engine;
    return this;
  }

  public Car build() {
    car =  new Car(plate, engine);
    return car;
  }

  public Car getCar() {
    return car;
  }

}
