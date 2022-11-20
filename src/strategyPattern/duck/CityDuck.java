package strategyPattern.duck;

import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.walk.WalkBehavior;

public class CityDuck implements Duck {

  private final FlyBehavior flyBehavior;
  private final WalkBehavior walkBehavior;

  public CityDuck(FlyBehavior flyBehavior, WalkBehavior walkBehavior) {
    this.flyBehavior = flyBehavior;
    this.walkBehavior = walkBehavior;
  }

  @Override
  public String walk() {
    return this.walkBehavior.walk();
  }

  @Override
  public String fly() {
    return this.flyBehavior.fly();
  }
}
