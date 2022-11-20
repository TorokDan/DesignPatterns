import strategyPattern.behavior.fly.CasualFly;
import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.walk.CasualWalk;
import strategyPattern.behavior.walk.WalkBehavior;
import strategyPattern.duck.CloudDuck;
import strategyPattern.duck.Duck;
import strategyPattern.duck.MountainDuck;
import strategyPattern.duck.WildDuck;

public class Main {

  public static void main(String[] args) {
    // Walk behaviors
    WalkBehavior casualWalk = new CasualWalk();
    WalkBehavior walkLambda = () -> "Walking with lambda";

    // Fly behaviors
    FlyBehavior flyLambda = () -> "Flying with lambda";
    FlyBehavior casualFly = new CasualFly();

    // Ducks
    Duck testDuck = new WildDuck(
        () -> "testing  the flying",
        walkLambda
    );
    Duck wildDuck = new WildDuck(flyLambda, casualWalk );
    Duck mountainDuck = new MountainDuck(casualFly, casualWalk);
    Duck cloudDuck = new CloudDuck(casualFly, walkLambda);

    // printing out
    print(new Duck[] {
        testDuck,
        wildDuck,
        mountainDuck,
        cloudDuck
    });
  }

  public static void print(Duck[] ducks) {
    for (Duck duck :
        ducks) {
      System.out.println(duck.getClass());
      System.out.println(duck.fly());
      System.out.println(duck.walk());
      System.out.println("-".repeat(20));
    }
  }
}