package creational.builder.own.vehicle;

import creational.builder.own.engine.Engine;

public class Car {

  protected String plate;
  protected Engine engine;

  public Car(String plate, Engine engine) {
    this.plate = plate;
    this.engine = engine;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }
}
