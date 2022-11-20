package strategyPattern.behavior.fly;

public class CasualFly implements FlyBehavior{

  @Override
  public String fly() {
    return "Flying casually";
  }
}
