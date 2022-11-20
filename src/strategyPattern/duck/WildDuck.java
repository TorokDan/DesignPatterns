package strategyPattern.duck;

import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.walk.WalkBehavior;

public class WildDuck implements Duck {

  private final FlyBehavior flyBehavior;
  private final WalkBehavior  walkBehavior;

  public WildDuck(FlyBehavior fly, WalkBehavior walk) {
    this.flyBehavior = fly;
    this.walkBehavior = walk;
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
