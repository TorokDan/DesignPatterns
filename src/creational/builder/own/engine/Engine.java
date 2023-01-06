package creational.builder.own.engine;

public class Engine {
  String name;
  int horsePower;

  public Engine(String name, int horsePower) {
    this.name = name;
    this.horsePower = horsePower;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHorsePower() {
    return horsePower;
  }

  public void setHorsePower(int horsePower) {
    this.horsePower = horsePower;
  }
}
