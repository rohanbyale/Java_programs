/**
 * Main
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Device ob = new Light();
        ob.turnOn();
        ob.turnOff();

        Speaker s = new Speaker();
        s.turnOn();
        s.connectToWif();
        s.turnOff();
    }

}

interface Device {
    void turnOn();

    void turnOff();
}

interface BluetoothDevice {
    public abstract void connectToWif();

}

class Speaker implements Device, BluetoothDevice {
    public void turnOn() {
        System.out.println("Speaker is Turned on");
    }

    public void connectToWif() {
        System.out.println("Connected to wifi");
    }

    public void turnOff() {
        System.out.println("Speaker is turned off");
    }
}

class Light implements Device {
    public void turnOn() {
        System.out.println("Light is turned on");
    }

    public void turnOff() {
        System.out.println("Light is tunred off");
    }
}