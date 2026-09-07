/**
 * NestedInterface
 */
public class NestedInterface {

    public static void main(String[] args) {
        Car c = new Car();
        c.name();
        c.speed();
    }
}

// outer interface
interface Model {

    void name();

    // inner interface
    interface inner {
        void speed();

    }
}

class Car implements Model, Model.inner {
    @Override
    public void name() {
        System.out.println("Maruti");
    }

    @Override
    public void speed() {
        System.out.println("120 km/h");
    }
}
