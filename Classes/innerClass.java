import java.util.*;

public class innerClass {
  public static void main(String[] args) {

    Car.Engine obj = new Car().new Engine(10, 20);
    Car car = new Car("BMW", obj);
    System.out.println(car);

  }
}

class Car {

  class Engine {
    public int hp;
    public double milage;

    public Engine(int hp, double milage) {
      this.hp = hp;
      this.milage = milage;
    }

    public String toString() {
      return "hp = " + hp + " milage = " + milage;
    }
  }

  public String name;
  public Engine engine;

  public Car() {
  };

  public Car(String name, Engine engine) {
    this.name = name;
    this.engine = engine;
  }

  public String toString() {
    return "name = " + name + " Engine = " + engine;
  }

}